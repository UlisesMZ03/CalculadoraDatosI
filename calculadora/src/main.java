

import java.util.Arrays;
import java.util.List;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Pos;
import javafx.scene.Cursor;
//import javafx.fxml.FXML;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
//import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundImage;
import javafx.scene.layout.BackgroundPosition;
import javafx.scene.layout.BackgroundRepeat;
import javafx.scene.layout.BackgroundSize;
import javafx.scene.layout.Pane;
import javafx.scene.text.Font;
import javafx.stage.Stage;

/**
 *
 * La clase main es la clase principal que extiende de la clase Application.
 * Esta clase tiene como objetivo crear una aplicación que permita agregar
 * personas con su nombre, edad y provincia y hacer operaciones aritméticas con
 * sus edades.
 *
 * @author Ulises
 * @version 1.0
 * @since 2023-03-08
 */
public class main extends Application {

    private Persona persona1;
    private Persona persona2;
    private Persona persona3;
    private Persona persona4;
    private Persona opcion1;
    private Persona opcion2;

    private int resultado = 0;

    /**
     * El método sumarEdades() calcula la suma de las edades de opcion1 y
     * opcion2 y almacena el resultado en la variable resultado.
     */
    public void sumarEdades() {
        int sumaEdades = opcion1.getEdad() + opcion2.getEdad();
        resultado = sumaEdades;
    }

    /**
     * El método restarEdades() calcula la resta de las edades de opcion1 y
     * opcion2 y almacena el resultado en la variable resultado.
     */
    public void restarEdades() {
        int restaEdades = opcion1.getEdad() - opcion2.getEdad();
        resultado = restaEdades;

    }

    /**
     * El método multiplicarEdades() calcula la multiplicación de las edades de
     * opcion1 y opcion2 y almacena el resultado en la variable resultado.
     */
    public void multiplicarEdades() {
        int multiplicacionEdades = opcion1.getEdad() * opcion2.getEdad();
        resultado = multiplicacionEdades;

    }

    /**
     * El método dividirEdades() calcula la división de las edades de opcion1 y
     * opcion2 y almacena el resultado en la variable resultado.
     */
    public void dividirEdades() {
        double divisionEdades = (double) opcion1.getEdad() / opcion2.getEdad();
        resultado = (int) divisionEdades;

    }

    /**
     * El método start() es el método principal de la aplicación que se ejecuta
     * al iniciar la aplicación. Crea una ventana con una imagen de fondo, un
     * formulario para ingresar los datos de una persona y botones para realizar
     * las operaciones aritméticas con sus edades.
     *
     * @param primaryStage El escenario principal de la aplicación.
     * @throws Exception
     */
    @Override
    public void start(Stage primaryStage) throws Exception {

        // Establece el título de la ventana principal
        primaryStage.setTitle("Calculadora de edades");

        // Crea un objeto Image con la imagen de fondo
        Image image = new Image("C:/Users/ulise/Desktop/calculadora/src/background.jpg");

        // Establece la configuración para la imagen de fondo
        BackgroundSize backgroundSize = new BackgroundSize(1.0, 1.0, true, true, false, false); // Los dos primeros parámetros son: width, height
        BackgroundImage backgroundImage = new BackgroundImage(image, BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, backgroundSize);
        Background background = new Background(backgroundImage);

        // Crea un objeto Pane para colocar los elementos de la interfaz gráfica
        Pane pane = new Pane();
        pane.setBackground(background);

        // Crea un objeto Label y TextField para ingresar el nombre de la persona
        Label labelNombre = new Label("Nombre:");
        TextField textFieldNombre = new TextField();
        labelNombre.setFont(Font.font("Impact"));
        labelNombre.setLayoutX(42);
        labelNombre.setLayoutY(102);
        textFieldNombre.setLayoutX(42);
        textFieldNombre.setLayoutY(119);

        // Agrega los elementos del nombre al objeto Pane
        pane.getChildren().addAll(labelNombre, textFieldNombre);

        // Crea un objeto Label y TextField para ingresar la edad de la persona
        Label labelEdad = new Label("Edad:");
        labelEdad.setFont(Font.font("Impact"));
        TextField textFieldEdad = new TextField();
        labelEdad.setLayoutX(42);
        labelEdad.setLayoutY(150);
        textFieldEdad.setLayoutX(42);
        textFieldEdad.setLayoutY(168);

        // Agrega los elementos de la edad al objeto Pane
        pane.getChildren().addAll(labelEdad, textFieldEdad);

        // Crea un objeto Label para mostrar la provincia
        Label labelProvincia = new Label("Provincia:");
        labelProvincia.setFont(Font.font("Impact"));
        labelProvincia.setLayoutX(42);
        labelProvincia.setLayoutY(200);

        // Agrega el elemento de la provincia al objeto Pane
        pane.getChildren().add(labelProvincia);

        // Crea un botón para agregar los datos ingresados y calcular las edades
        Button buttonAgregar = new Button("Agregar");
        buttonAgregar.setFont(Font.font("Impact", 14));
        buttonAgregar.setCursor(Cursor.HAND);
        buttonAgregar.setLayoutX(82);
        buttonAgregar.setLayoutY(255);

        // Agrega el botón al objeto Pane
        pane.getChildren().add(buttonAgregar);

        // Crea un objeto Label para mostrar el título de la aplicación
        Label labelCalculadora = new Label("Calculadora");
        labelCalculadora.setFont(Font.font("Impact", 24));
        labelCalculadora.setLayoutX(151);
        labelCalculadora.setLayoutY(14);

        // Agrega el título al objeto Pane
        pane.getChildren().add(labelCalculadora);

        // Crea un objeto TextField para mostrar el resultado del cálculo de edades
        TextField textFieldResult = new TextField();

        // Establecer el texto de sugerencia para el campo de texto y establecer su fuente y tamaño
        textFieldResult.setPromptText("Resultado");
        textFieldResult.setFont(Font.font("System", 14));

        // Alinear el texto del campo de texto al centro, hacerlo no editable y establecer su posición y tamaño
        textFieldResult.setAlignment(Pos.CENTER);
        textFieldResult.setEditable(false);
        textFieldResult.setLayoutX(137);
        textFieldResult.setLayoutY(53);
        textFieldResult.setPrefWidth(149);
        textFieldResult.setPrefHeight(29);

        // Agregar el campo de texto al panel
        pane.getChildren().add(textFieldResult);
        
        // Crear botones para sumar, restar, multiplicar y dividir y establece sus fuentes, cursores, posiciones y tamaños, tambien los muestra en el panel
        Button buttonSumar = new Button("+");
        buttonSumar.setFont(Font.font("Impact"));
        buttonSumar.setCursor(Cursor.HAND);
        buttonSumar.setLayoutX(230);
        buttonSumar.setLayoutY(217);
        buttonSumar.setPrefWidth(30);
        pane.getChildren().add(buttonSumar);

        Button buttonRestar = new Button("-");
        buttonRestar.setFont(Font.font("Impact"));
        buttonRestar.setCursor(Cursor.HAND);
        buttonRestar.setLayoutX(269);
        buttonRestar.setLayoutY(217);
        buttonRestar.setPrefWidth(30);
        pane.getChildren().add(buttonRestar);

        Button buttonMultiplicar = new Button("*");
        buttonMultiplicar.setFont(Font.font("Impact"));
        buttonMultiplicar.setCursor(Cursor.HAND);
        buttonMultiplicar.setLayoutX(309);
        buttonMultiplicar.setLayoutY(217);
        buttonMultiplicar.setPrefWidth(30);
        buttonMultiplicar.setMaxWidth(Double.MAX_VALUE);
        pane.getChildren().add(buttonMultiplicar);

        Button buttonDividir = new Button("/");
        buttonDividir.setFont(Font.font("Impact"));
        buttonDividir.setCursor(Cursor.HAND);
        buttonDividir.setLayoutX(348);
        buttonDividir.setLayoutY(217);
        buttonDividir.setPrefWidth(30);
        pane.getChildren().add(buttonDividir);

        // Crear etiquetas para elegir la persona 1 y la persona 2 y establecer sus fuentes y posiciones
        Label elegirPersona1 = new Label("Persona 1");
        elegirPersona1.setFont(Font.font("Impact"));
        elegirPersona1.setLayoutX(230);
        elegirPersona1.setLayoutY(102);
        pane.getChildren().add(elegirPersona1);

        Label elegirPersona2 = new Label("Persona 2");
        elegirPersona2.setFont(Font.font("Impact"));
        elegirPersona2.setLayoutX(230);
        elegirPersona2.setLayoutY(150);
        pane.getChildren().add(elegirPersona2);

        // Lista de provincias de Costa Rica
        List<String> provincias = Arrays.asList("San José", "Alajuela", "Cartago", "Heredia", "Guanacaste", "Puntarenas", "Limón");

        // Crear un ChoiceBox para seleccionar la provincia y establecer su posición y tamaño
        ChoiceBox<String> choiceBoxProvincia = new ChoiceBox<>();
        ObservableList<String> itemsProvincia = FXCollections.observableArrayList(provincias);
        choiceBoxProvincia.setCursor(Cursor.HAND);
        choiceBoxProvincia.setLayoutX(40);
        choiceBoxProvincia.setLayoutY(217);
        choiceBoxProvincia.setPrefWidth(150);
        choiceBoxProvincia.setItems(itemsProvincia);
        pane.getChildren().add(choiceBoxProvincia);

        // Crear dos ChoiceBox para seleccionar la persona 1 y la persona 2 y establecer su posición y tamaño
        ChoiceBox<String> choiceBox1 = new ChoiceBox<>();
        choiceBox1.setCursor(Cursor.HAND);
        ObservableList<String> items = FXCollections.observableArrayList();
        choiceBox1.setLayoutX(230);
        choiceBox1.setLayoutY(119);
        choiceBox1.setItems(items);
        choiceBox1.setPrefWidth(150);
        pane.getChildren().add(choiceBox1);
        ChoiceBox<String> choiceBox2 = new ChoiceBox<>();
        choiceBox2.setCursor(Cursor.HAND);
        choiceBox2.setLayoutX(230);
        choiceBox2.setLayoutY(168);
        choiceBox2.setItems(items);
        choiceBox2.setPrefWidth(150);
        pane.getChildren().add(choiceBox2);

        // Agrega una accion al choiceBox1 que lo que realiza es la seleccion en una variable opcion1
        choiceBox1.setOnAction(event -> {
            String seleccion = choiceBox1.getValue();
            
            //Compara si la seleccion es igual al nombre de la persona1 
            if (seleccion == persona1.getNombre()) {
                opcion1 = persona1;

            }
             //Verifica si la lista items tiene 2 o mas nombres
            if (items.size() >= 2) {
                //verifica si la seleccion es igual al nombre de la persona2 
                if (seleccion == persona2.getNombre()) {
                    opcion1 = persona2;

                }
            }
            //Verifica si la lista items tiene 3 o mas nombres
            if (items.size() >= 3) {
                //Verifica si la seleccion es igual al nombre de la persona3 
                if (seleccion == persona3.getNombre()) {
                    opcion1 = persona3;

                }
            }
             //Verifica si la lista items tiene 4 o mas nombres
            if (items.size() >= 4) {
                 //Verifica si la seleccion es igual al nombre de la persona4 
                if (seleccion == persona4.getNombre()) {
                    opcion1 = persona4;

                }
            }

        });
        // Agrega una accion al choiceBox1 que lo que realiza es la seleccion en una variable opcion2
        choiceBox2.setOnAction(event -> {

            String seleccion2 = choiceBox2.getValue();
            //Verifica si la seleccion es igual al nombre de la persona2 
            if (seleccion2 == persona1.getNombre()) {
                opcion2 = persona1;

            }
            //Verifica si la lista items tiene 2 o mas nombres
            if (items.size() >= 2) {
                //Verifica si la seleccion es igual al nombre de la persona2 
                if (seleccion2 == persona2.getNombre()) {
                    opcion2 = persona2;

                }
            }
            //Verifica si la lista items tiene 3 o mas nombres
            if (items.size() >= 3) {
                //Verifica si la seleccion es igual al nombre de la persona3 
                if (seleccion2 == persona3.getNombre()) {
                    opcion2 = persona3;

                }
            }
            //Verifica si la lista items tiene 4 o mas nombres
            if (items.size() >= 4) {
                //Verifica si la seleccion es igual al nombre de la persona4 
                if (seleccion2 == persona4.getNombre()) {
                    opcion2 = persona4;

                }
            }

        });

        // Agrega una accion al boton Agregar
        buttonAgregar.setOnAction(event -> {
            int cantPersonas = items.size();
            
            //Verifica si la cantidad de personas es menor a 4 para limitar el maximo a 4
            if (cantPersonas < 4) {

                int edad = 0;
                // Si lo ingresado en la caja de texto edad es diferente de vacio entonces lo convierte a entero
                if (!textFieldEdad.getText().isEmpty()) {
                    edad = Integer.parseInt(textFieldEdad.getText());
                }
                
                //guarda lo ingresado en la caja de texto y de seleccion en variables
                String nombre = textFieldNombre.getText();
                String provincia = choiceBoxProvincia.getValue();

                // Verifica si la caja de texto de nombre, edad están vacias asi como tambien la caja de seleccion de provincia
                if ((textFieldEdad.getText().isEmpty() || textFieldNombre.getText().isEmpty()) || choiceBoxProvincia.getValue() == null || edad<0) {
                    textFieldResult.setText("Error! Espacios vacios");
                } else {
                    textFieldResult.setText("");
                    //Crea un nuevo objeto Persona con los datos ingresados
                    Persona persona = new Persona(edad, nombre, provincia);

                    //Verifica cuantas personas hay para saber en que variable guardar a la nueva persona
                    if (cantPersonas == 0) {
                        persona1 = persona;
                    }
                    if (cantPersonas == 1) {
                        persona2 = persona;
                    }
                    if (cantPersonas == 2) {
                        persona3 = persona;
                    }
                    if (cantPersonas == 3) {
                        persona4 = persona;
                    }

                    //Agrega el nombre de la nueva persona a una lista para luego mostrar esta lista en un dropdownlist
                    items.add(persona.getNombre());
                }
            } else {
                textFieldResult.setText("Error! Se ha alcanzado el máximo de personas.");
            }
        });

        //Agrega una accion al boton sumar que verifica que las opciones no sean vacias y llama al metodo sumarEdades(), tambien reescribe el textFieldResult
        buttonSumar.setOnAction(event -> {
            
            if (opcion1!=null && opcion2!=null){
                sumarEdades();
                textFieldResult.setText("Resultado: " + resultado);
            }
            else{
                textFieldResult.setText("Opcion vacia");
            }
            
        });
//Agrega una accion al boton resatr que verifica que las opciones no sean vacias y llama al metodo restarEdades(), tambien reescribe el textFieldResult
        buttonRestar.setOnAction(event -> {
            if (opcion1!=null && opcion2!=null){
                restarEdades();
                textFieldResult.setText("Resultado: " + resultado);
            }
            else{
                textFieldResult.setText("Opcion vacia");
            }
        });
//Agrega una accion al boton multiplicar que verifica que las opciones no sean vacias y llama al metodo multiplicarEdades(), tambien reescribe el textFieldResult
        buttonMultiplicar.setOnAction(event -> {
            if (opcion1!=null && opcion2!=null){
                multiplicarEdades();
                textFieldResult.setText("Resultado: " + resultado);
            }
            else{
                textFieldResult.setText("Opcion vacia");
            }
        });
//Agrega una accion al boton dividir que verifica que las opciones no sean vacias y llama al metodo dividirEdades(), tambien reescribe el textFieldResult
        buttonDividir.setOnAction(event -> {
            if (opcion1!=null && opcion2!=null){
                dividirEdades();
                textFieldResult.setText("Resultado: " + resultado);
            }
            else{
                textFieldResult.setText("Opcion vacia");
            }
        });

        //Crea una nueva escena y la pone en el estado primario para mostrarla.
        Scene scene = new Scene(pane, 422, 315);
        primaryStage.setScene(scene);
        primaryStage.show();

    }
/**

Método principal que inicia la aplicación JavaFX
@param args los argumentos de la línea de comandos
*/
    public static void main(String[] args) {

        launch(args);
    }
}
