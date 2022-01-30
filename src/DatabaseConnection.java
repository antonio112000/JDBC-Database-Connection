import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DatabaseConnection {


    public static void main(String[] args) {
        String Jdbc_Url = "jdbc:postgresql://localhost:5432/postgres";
        String username = "postgres";
        String pass = "admin";
        try {
            Connection connection = DriverManager.getConnection(Jdbc_Url,username,pass);
            System.out.println("Connexion etablis");
            //String Sql = "INSERT INTO MatieresEsib (Code, Nom_Matiere, Enseignant,Type_Genie)" + "VALUES ('020GDEES4' ,'Gestion des données d entreprise', 'Rima KILANY CHAMOUN','CCE')";
            String Sql= "SELECT * FROM matieresesib WHERE enseignant='Rima KILANY CHAMOUN'";
            Statement statement = connection.createStatement();
            ResultSet result= statement.executeQuery(Sql);

            System.out.println("les matieres enseignes par Dr Rima KILANY CHAMOUN a l'ESIB durant le semestre 2 de l'annee 2021-2022 sont: ");


            while (result.next()) {
                String Code_matiere = result.getString("code");
                String matiere= result.getString("nom_matiere");
                String Major = result.getString("type_genie");

                System.out.println("Code de la matiere: "+ Code_matiere+", Nom de la matiere: "+matiere+", Etudiants concernes: "+Major );


            }
//			String resultat = rows>0?"oui":"non";
//			System.out.println(resultat);
            connection.close();
        } catch (SQLException e) {
            System.out.println("erreur lors de la connexion au postgres");
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }


}
