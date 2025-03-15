package dio.gof.service.impl;

import dio.gof.model.Cliente;
import dio.gof.model.ClienteRepository;
import dio.gof.model.Endereco;
import dio.gof.model.EnderecoRepository;
import dio.gof.service.ClienteService;
import dio.gof.service.ViaCepService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ClienteServiceImpl implements ClienteService {
    //Singleton: Injetar os componentes Spring com @Autowired;
    @Autowired
    private ClienteRepository clienteRepository;
    @Autowired
    private EnderecoRepository enderecoRepository;
    @Autowired
    private ViaCepService viaCepService;

    //Strategy: Implementar os métodos definidos na interface;
    //Facade: Abstrair as integracoes com subsistemas, provendo uma interface simples;
    @Override
    public Iterable<Cliente> buscarTodos() {
        return clienteRepository.findAll();
    }

    @Override
    public Cliente buscarPorId(Long id) {
        Optional<Cliente> cliente = clienteRepository.findById(id);
        if(cliente.get() == null){
            return null;
        }
        return cliente.get();
    }

    @Override
    public void inserir(Cliente cliente) {
        salvarCliente(cliente);
    }

    private void salvarCliente(Cliente cliente) {
        // verifica se o endereco do cliente ja existe pelo (cep);
        String cep = cliente.getEndereco().getCep();
        Endereco endereco = enderecoRepository.findById(cep).orElseGet(()->{
            //caso nao exista, integrar com o ViaCep e persistir no retorno;
            Endereco novoEndereco = viaCepService.consultarCep(cep);
            enderecoRepository.save(novoEndereco);
            return novoEndereco;
        });
        //inserir cliente, vinculando o endereco (novo ou existente);
        cliente.setEndereco(endereco);
        clienteRepository.save(cliente);
    }

    @Override
    public void atualizar(Long id, Cliente cliente) {
        if(buscarPorId(id)!=null){
            salvarCliente(cliente);
        }
    }

    @Override
    public void deletar(Long id) {
        clienteRepository.deleteById(id);
    }
}
