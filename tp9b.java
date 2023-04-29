import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import java.util.ArrayList;
import java.util.List;

public class tp9b extends Application {

    private List<Integer> notes = new ArrayList<>(); // Utiliser une liste dynamique pour stocker les notes saisies
    private Label moyenneLabel = new Label();
    private Label supLabel = new Label();

    @Override
    public void start(Stage primaryStage) {
        GridPane gridPane = new GridPane();
        gridPane.setAlignment(Pos.CENTER);
        gridPane.setHgap(10);
        gridPane.setVgap(10);
        gridPane.setPadding(new Insets(25, 25, 25, 25));

        Label label = new Label("Saisir les notes de la classe :");
        gridPane.add(label, 0, 0, 2, 1);

        Label noteLabel = new Label("Note :");
        gridPane.add(noteLabel, 0, 1);

        TextField noteTextField = new TextField();
        gridPane.add(noteTextField, 1, 1);

        Button ajouterButton = new Button("Ajouter");
        HBox hbAjouterButton = new HBox(10);
        hbAjouterButton.setAlignment(Pos.BOTTOM_RIGHT);
        hbAjouterButton.getChildren().add(ajouterButton);
        gridPane.add(hbAjouterButton, 1, 2);

        ajouterButton.setOnAction(event -> {
            try {
                int note = Integer.parseInt(noteTextField.getText());
                notes.add(note);
                noteTextField.clear();
                updateLabels();
            } catch (NumberFormatException e) {
                // Ne rien faire si l'utilisateur saisit une entrée non valide
            }
        });

        VBox vBox = new VBox(10);
        vBox.setAlignment(Pos.CENTER);
        vBox.getChildren().add(moyenneLabel);
        vBox.getChildren().add(supLabel);
        gridPane.add(vBox, 1, 3);

        Scene scene = new Scene(gridPane, 400, 300);
        primaryStage.setTitle("Classe Notes FX");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private void updateLabels() {
        int totalNotes = 0;
        for (int note : notes) {
            totalNotes += note;
        }

        double moyenne = (double) totalNotes / notes.size();
        moyenneLabel.setText("La moyenne de la classe est : " + moyenne);

        int sup = 0;
        for (int note : notes) {
            if (note > moyenne) {
                sup++;
            }
        }

        supLabel.setText("Le nombre de notes supérieures à la moyenne est : " + sup);
    }

    public static void main(String[] args) {
        launch(args);
    }
}
