package melo.maiorbrasileirofighter;

import com.mongodb.MongoClient;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Filters;
import javax.swing.DefaultListModel;
import org.bson.Document;

public class ResultadosMongo {
    
    public void insereResultado(String player, String oponente, int vencedor, String nick){
        MongoClient mongo = new MongoClient("localhost", 27017);
        MongoDatabase db = mongo.getDatabase("mbf");
        MongoCollection<Document> docs = db.getCollection("results");
        
        Document doc = createDocument(player, oponente, vencedor, nick);
        
        docs.insertOne(doc);
    }
    
    public Document createDocument(String player, String oponente, int vencedor, String nick) {
        Document builder = new org.bson.Document();

        builder.append("player", player);
        builder.append("oponente", oponente);
        builder.append("vencedor", vencedor);
        builder.append("nickname", nick);
        return builder;
    }
    
    public DefaultListModel buscaResultados(String nick){
        DefaultListModel model = new DefaultListModel();
        
        MongoClient mongo = new MongoClient("localhost", 27017);
        MongoDatabase db = mongo.getDatabase("mbf");
        MongoCollection<Document> docs = db.getCollection("results");
        
        FindIterable<Document> doc =  docs.find(Filters.eq("nickname", nick));
        for(Document docum : doc){
            String player = docum.getString("player");
            String oponente = docum.getString("oponente");
            double vencedor = docum.getInteger("vencedor");
            
            if (vencedor == 0){
                player = player.toUpperCase();
            } else if (vencedor == 1){
                oponente = oponente.toUpperCase();
            }
            
            model.addElement(player + " vs " +oponente);
        }
        return model;
    }
}
