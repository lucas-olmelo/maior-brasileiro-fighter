package melo.maiorbrasileirofighter;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Filters;
import com.mongodb.client.model.Updates;
import javax.swing.JOptionPane;
import org.bson.Document;

public class CRUD {
    
    public Player createUser(String email, String nick, String senha){
        Player p1 = new Player(email, nick, senha);
        return p1;
    }
    
    public void insertUser(String email, String nick, String senha){
        MongoClient mongo = new MongoClient("localhost", 27017);
        MongoDatabase db = mongo.getDatabase("mbf");
        MongoCollection<Document> docs = db.getCollection("players");
        
        Player player = createUser(email, nick, senha);
        Document doc = createDocument(player);
        
        docs.insertOne(doc);
    }
    
    public Document createDocument(Player user) {
        Document builder = new Document();

        builder.append("nickname", user.getNick());
        builder.append("email", user.getEmail());
        builder.append("senha", user.getPassword());
        return builder;
    }
    
    public void logarUsuario(String email, String senha){
        MongoClient mongo = new MongoClient("localhost", 27017);
        MongoDatabase db = mongo.getDatabase("mbf");
        MongoCollection<Document> docs = db.getCollection("players");
        Document doc =  docs.find(Filters.eq("email", email)).first();
        
        if (doc == null){
            JOptionPane.showMessageDialog(null, "Usuário não encontrado", "Erro", JOptionPane.ERROR_MESSAGE);
        } else {
            String emailMongo = doc.getString("email");
            String senhaMongo = doc.getString("senha");
            String nickMongo = doc.getString("nickname");
            
            if (senhaMongo.equals(senha)){
                TelaInicial luta = new TelaInicial();
                luta.setEmail(emailMongo);
                luta.setNick(nickMongo);
                luta.setVisible(true);
                setFlagFechar(1);
            } else {
                JOptionPane.showMessageDialog(null, "Senha incorreta", "Erro", JOptionPane.ERROR_MESSAGE);
            }
        }
    }
    
    int flagFechar;

    public int getFlagFechar() {
        return flagFechar;
    }

    public void setFlagFechar(int flag) {
        this.flagFechar = flag;
    }
}
