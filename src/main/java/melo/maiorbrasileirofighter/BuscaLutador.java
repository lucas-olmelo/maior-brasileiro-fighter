package melo.maiorbrasileirofighter;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Filters;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import org.bson.Document;

public class BuscaLutador {
    
    public Fighter buscarLutador(String nome){
        MongoClient mongo = new MongoClient("localhost", 27017);
        MongoDatabase db = mongo.getDatabase("mbf");
        MongoCollection<Document> docs = db.getCollection("fighters");
        Document doc =  docs.find(Filters.eq("nome", nome)).first();
        
        double posicao = doc.getDouble("posicao");
        String ataque1 = doc.getString("ataque1");
        String ataque2 = doc.getString("ataque2");
        double dano = doc.getDouble("dano");
        double hp = doc.getDouble("hp");
        String fraseVit = doc.getString("fraseVit");
        String fraseDer = doc.getString("fraseDer");
        
        int pos = (int)posicao;
        int dn = (int)dano;
        int vida = (int)hp;
        
        Fighter fig = new Fighter(nome, pos, ataque1, ataque2, dn, vida, fraseVit, fraseDer);
        return fig;
    }
    
    public DefaultListModel listarAtributos(String nome){
        DefaultListModel model = new DefaultListModel();
        Fighter fig = buscarLutador(nome);
        
        model.addElement("Nome: " +fig.getNome());
        model.addElement(fig.getPosicao() + "º maior brasileiro(a) de todos os tempos");
        model.addElement("Ataque 1: " +fig.getAtaquePrimario());
        model.addElement("Ataque 2: " +fig.getAtaqueSecundario());
        model.addElement("Dano máximo: " +fig.getDano());
        model.addElement("HP: " +fig.getHp());
        
        return model;
    }
    
    public ArrayList buscaAtributos(String nome){
        ArrayList model = new ArrayList();
        Fighter fig = buscarLutador(nome);
        
        model.add("Nome: " +fig.getNome());
        model.add(fig.getPosicao() + "º maior brasileiro(a) de todos os tempos");
        model.add("Ataque 1: " +fig.getAtaquePrimario());
        model.add("Ataque 2: " +fig.getAtaqueSecundario());
        model.add("Dano máximo: " +fig.getDano());
        model.add("HP: " +fig.getHp());
        
        return model;
    }
}
