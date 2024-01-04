/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora_190919;

import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.WindowEvent;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author sheldon
 */
public class Calculadora_190919 extends JFrame implements ActionListener, KeyListener {
    
    //declaraciones
    //panel padre
    JPanel pane = new JPanel(new GridBagLayout());
    JButton b1;
    JButton b2;
    JButton b3;
    JButton b4;
    JButton b5;
    JButton b6;
    JButton b7;
    JButton b8;
    JButton b9;
    JButton b0;
    JButton bretroceder;
    JButton bCE;//CE
    JButton bC;//C
    JButton bsigno;//+-
    JButton braiz;//raiz
    JButton bporcentaje;// '' % ''
    JButton binversa;// '' 1/x ''
    JButton punto;// '' . ''
    JButton igual;// '' = ''
    JButton div;//   '' / ''
    JButton mult; // '' * ''
    JButton resta;// '' - ''
    JButton suma;// '' + ''
    JButton nada;
    JButton nada2;
    Font font3 = new Font("Arial", Font.BOLD, 20);
    JTextField contenido;

    double op1 = 0, op2 = 0;//operacion 1 y 2
    char oper;//operador
    boolean sob = true;//bandera de sobreescritura
    double res = 0;

    public Calculadora_190919() {
        nada= new JButton("");
        nada2= new JButton("");
        b1 = new JButton("1");
        b2 = new JButton("2");
        b3 = new JButton("3");
        b4 = new JButton("4");
        b5 = new JButton("5");
        b6 = new JButton("6");
        b7 = new JButton("7");
        b8 = new JButton("8");
        b9 = new JButton("9");
        b0 = new JButton("0");
        bretroceder = new JButton("←");
        bCE = new JButton("CE");
        bC = new JButton("C");
        bsigno = new JButton("±");
        braiz = new JButton("√");
        bporcentaje = new JButton("%");
        binversa = new JButton("1/x");
        punto = new JButton(".");
        igual = new JButton("=");
        div = new JButton("/");
        mult = new JButton("*");
        resta = new JButton("-");
        suma = new JButton("+");
        contenido = new JTextField("                             ");
        //colocacion del panel al punto medio de la pantalla
        this.setLocationRelativeTo(null);
        //creacion de paneles hijos
        JPanel numero0 = new JPanel();
        JPanel numeros = new JPanel();
        JPanel caracteres = new JPanel();
        JPanel textfield = new JPanel();
        JPanel operaciones = new JPanel();
        JPanel iguall = new JPanel();

        //creamos el contenedor del pane padre
        Container cp = getContentPane();

        //modificador del tamaño de cada panel y su contenido
        GridBagConstraints text = new GridBagConstraints(); //contenido
        text.gridheight = 1;
        text.gridwidth = 0;
        text.gridx = 0;
        text.gridy = 1;
        contenido.setPreferredSize(new Dimension(230, 45));
        GridBagConstraints c2 = new GridBagConstraints(); //caracteres
        c2.gridheight = 1;
        c2.gridwidth = 0;
        c2.gridx = 0;
        c2.gridy = 2;
        GridBagConstraints c = new GridBagConstraints(); //numeros 1,2,3,4...7,8,9
        c.gridheight = 0;
        c.gridwidth = 1;
        c.gridx = 0;
        c.gridy = 3;
        GridBagConstraints c5 = new GridBagConstraints();//numero0 : 0
        c5.gridheight = 3;
        c5.gridwidth = 3;
        c5.gridx = 0;
        c5.gridy = 6;
        GridBagConstraints c6 = new GridBagConstraints();//operaciones /, *,+,etc
        c6.gridheight = 0;
        c6.gridwidth = 1;
        c6.gridx = 2;
        c6.gridy = 4;
        GridBagConstraints c7 = new GridBagConstraints();//operaciones /, *,+,etc
        c7.gridheight = 0;
        c7.gridwidth = 0;
        // c6.gridx=0;
        c7.gridx = 1;
        //   c6.gridy=5;
        c7.gridy = 35;


        //para acomodar los numeros
        GridLayout gridLayout2 = new GridLayout();
        gridLayout2.setRows(4);
        gridLayout2.setHgap(2);//separacion de lineas entre lados izq y derecha
        gridLayout2.setColumns(3);
        gridLayout2.setVgap(2);//Separacion de lineas arriba y abajo
        numeros.setLayout(gridLayout2);
        //para acomodar las operaciones a lado de los numeros y en columnas, filas
        GridLayout gridLayout1 = new GridLayout();
        gridLayout1.setRows(4);
        gridLayout1.setHgap(2);
        gridLayout1.setColumns(2);
        gridLayout1.setVgap(2);
        operaciones.setLayout(gridLayout1);
        
        //añadimos los objetos al panel
        textfield.add(contenido);
        caracteres.add(bretroceder);
        caracteres.add(bCE);
        caracteres.add(bC);
        caracteres.add(bsigno);
        caracteres.add(braiz);
        numeros.add(b7);
        numeros.add(b8);
        numeros.add(b9);
        numeros.add(b4);
        numeros.add(b5);
        numeros.add(b6);
        numeros.add(b1);
        numeros.add(b2);
        numeros.add(b3);
        numeros.add(b0);
        numeros.add(punto);
        numeros.add(nada2);
        operaciones.add(div);
        operaciones.add(bporcentaje);
        operaciones.add(mult);
        operaciones.add(binversa);
        operaciones.add(resta);
        operaciones.add(igual);
        operaciones.add(suma);
        operaciones.add(nada);
        
        //añadimos los paneles al panel padre
        pane.add(numeros, c);
        pane.add(caracteres, c2);
        pane.add(textfield, text);
        pane.add(operaciones, c6);

 

       
        //añadiremos los action y key listener
        
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
        b7.addActionListener(this);
        b8.addActionListener(this);
        b9.addActionListener(this);
        b0.addActionListener(this);
        b1.addKeyListener(this);
        b2.addKeyListener(this);
        b3.addKeyListener(this);
        b4.addKeyListener(this);
        b5.addKeyListener(this);
        b6.addKeyListener(this);
        b7.addKeyListener(this);
        b8.addKeyListener(this);
        b9.addKeyListener(this);
        b0.addKeyListener(this);
        punto.addActionListener(this);
        punto.addKeyListener(this);
        contenido.addKeyListener(this);
        contenido.addActionListener(this);
        bretroceder.addActionListener(this);
        bretroceder.addKeyListener(this);
        bCE.addActionListener(this);
        bC.addActionListener(this);
        braiz.addActionListener(this);
        bsigno.addActionListener(this);
        div.addActionListener(this);
        bporcentaje.addActionListener(this);
        mult.addActionListener(this);
        binversa.addActionListener(this);
        resta.addActionListener(this);
        suma.addActionListener(this);
        
        igual.addActionListener(this);
        igual.addKeyListener(this);
        
        //quitamos la opcion de edicion del textfield
        contenido.setEditable(false);
        
        //estetica
       pane.setBackground(Color.PINK.darker());
       numeros.setBackground(Color.PINK.darker());
       operaciones.setBackground(Color.PINK.darker());
       caracteres.setBackground(Color.PINK.darker());
       contenido.setBackground(Color.pink);
       contenido.setFont(font3);
       contenido.setForeground(Color.DARK_GRAY);
       contenido.setBorder(BorderFactory.createRaisedBevelBorder());
       operaciones.setBorder(BorderFactory.createRaisedSoftBevelBorder());
       numeros.setBorder(BorderFactory.createRaisedSoftBevelBorder());
       pane.setBorder(BorderFactory.createRaisedBevelBorder());

       //alinear el texto a la derecha
        contenido.setHorizontalAlignment(JTextField.RIGHT);
        
        
        //añadimos el panel al contenedor
        cp.add(pane);

        //le añadimos un tamaño
        //hacemos visible el panel
        pack();
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);

    }
//YA CASII
    public static void main(String[] args) {
        // TODO code application logic here
        new Calculadora_190919();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            if (e.getSource().equals(b7)) {
                if (sob == true) {
                    contenido.setText("7");
                    sob = false;
                } else {
                    contenido.setText(contenido.getText() + "7");
                    contenido.requestFocus();
                    
                }
            }
            if (e.getSource().equals(b8)) {
                if (sob == true) {
                    contenido.setText("8");
                    sob = false;
                } else {
                    contenido.setText(contenido.getText() + "8");
                    contenido.requestFocus();
                   
                }
            }
            if (e.getSource().equals(b9)) {
                if (sob == true) {
                    contenido.setText("9");
                    sob = false;
                } else {
                    contenido.setText(contenido.getText() + "9");
                    contenido.requestFocus();
                  
                }
            }
            if (e.getSource().equals(b4)) {
                if (sob == true) {
                    contenido.setText("4");
                    sob = false;
                } else {
                    contenido.setText(contenido.getText() + "4");
                    contenido.requestFocus();
                   
                }
            }
            if (e.getSource().equals(b5)) {
                if (sob == true) {
                    contenido.setText("5");
                    sob = false;
                } else {
                    contenido.setText(contenido.getText() + "5");
                    contenido.requestFocus();
                    
                }
            }
            if (e.getSource().equals(b6)) {
                if (sob == true) {
                    contenido.setText("6");
                    sob = false;
                } else {
                    contenido.setText(contenido.getText() + "6");
                    contenido.requestFocus();
                   
                }
            }
            if (e.getSource().equals(b1)) {
                if (sob == true) {
                    contenido.setText("1");
                    sob = false;
                } else {
                    contenido.setText(contenido.getText() + "1");
                    contenido.requestFocus();
                  
                }
            }
            if (e.getSource().equals(b2)) {
                if (sob == true) {
                    contenido.setText("2");
                    sob = false;
                } else {
                    contenido.setText(contenido.getText() + "2");
                    contenido.requestFocus();
                   
                }
            }
            if (e.getSource().equals(b3)) {
                if (sob == true) {
                    contenido.setText("3");
                    sob = false;
                } else {
                    contenido.setText(contenido.getText() + "3");
                    contenido.requestFocus();
                   
                }
            }
            if (e.getSource().equals(b0)) {
                if (sob == true) {
                    contenido.setText("0");
                    sob = false;
                } else {
                    contenido.setText(contenido.getText() + "0");
                    contenido.requestFocus();
                   
                }//
            }
            //HASTA AQUI TERMINAN LOS NUMEROS Y SU CONCATENAMIENTO
            //INICIAN OPERACIONES
            if (e.getSource().equals(suma)) {
                oper = '+';
                op1 = Double.parseDouble(contenido.getText());
                
                        
                sob = true;
                op2 = Double.parseDouble(contenido.getText());
                
            }
            if (e.getSource().equals(resta)) {
                oper = '-';
                op1 = Double.parseDouble(contenido.getText());
                sob = true;
            }
            if (e.getSource().equals(div)) {
                oper = '/';
                op1 = Double.parseDouble(contenido.getText());
                sob = true;
            }
            if (e.getSource().equals(mult)) {
                oper = '*';
                op1 = Double.parseDouble(contenido.getText());
                sob = true;
            }
            if (e.getSource().equals(bporcentaje)) {
                oper = '%';
                op1 = Double.parseDouble(contenido.getText());
                contenido.setText("%");
                sob = true;
            }
            if (e.getSource().equals(igual)) {

                switch (oper) {
                    case '+':
                        
                        res = op1 + op2;
                        contenido.setText(Double.toString(res));
                        sob = true;
                        op1 = res;
                        op2 = 0;
                        
                        break;
                    case '-':
                        op2 = Double.parseDouble(contenido.getText());
                        res = op1 - op2;
                        contenido.setText(Double.toString(res));
                        sob = true;
                        op1 = res;
                        op2 = 0;
                        break;
                    case '/':
                        op2 = Double.parseDouble(contenido.getText());
                        res = op1 / op2;
                        contenido.setText(Double.toString(res));
                        sob = true;
                        op1 = res;
                        op2 = 0;
                        break;
                    case '*':
                        op2 = Double.parseDouble(contenido.getText());
                        res = op1 * op2;
                        contenido.setText(Double.toString(res));
                        sob = true;
                        op1 = res;
                        op2 = 0;
                        break;
                    case '%': //primero selecciona el numero, su porcentaje y al dar click en igual, da su resultado, ej: ingreso 10, luego click en % y luego en 90, luego = 9.0
                        op2 = Double.parseDouble(contenido.getText());
                        res = (op2 * op1) / 100;
                        contenido.setText(Double.toString(res));
                        sob = true;
                        op1 = res;
                        op2 = 0;
                        break;
                    

                }
            }
            //HASTA AQUI ACABAN LOS RESULTADOS CON EL IGUAL
            //INICIAN CARACTERES DE RESULTADO DIRECTO
            if (e.getSource().equals(bretroceder)) {
                if (contenido.getText().length() != 0) {
                    contenido.setText(contenido.getText().substring(0, contenido.getText().length() - 1));
                }
            }
            if (e.getSource().equals(bCE)) {
                //borra el ultimo texto en pantalla
                contenido.setText("");
                
                

            }
            if (e.getSource().equals(bC)) {//pendiente, actua como CE
                //borra absolutamente todo el contenido de la calculadora
                contenido.setText(null);
            }
            if (e.getSource().equals(punto)) {//pendiente
                oper = '.';
                
                if(!contenido.getText().contains(".")){
                    if(sob){
                    contenido.setText(".");
                    sob=false;
                }else{
                contenido.setText(contenido.getText() + ".");
                    }
                } 
            }
            if (e.getSource().equals(bsigno)) {
                op1 = Double.parseDouble(contenido.getText());
                if (op1 > 0) {
                    res = op1 * -1;
                    contenido.setText(Double.toString(res));
                }
                if (op2 > 0) {
                    res = op2 * -1;
                    contenido.setText(Double.toString(res));
                }//
               
                if(op1<0) {
                    res = Math.abs(op1);
                    contenido.setText(Double.toString(res));
                }
                if(op2<0) {
                    res = Math.abs(op2);
                    contenido.setText(Double.toString(res));
                }
                
            }
            if (e.getSource().equals(braiz)) {
                op1 = Double.parseDouble(contenido.getText());
                res = Math.sqrt(op1);
                contenido.setText(Double.toString(res));

            }
            if (e.getSource().equals(binversa)) {
                op1 = Double.parseDouble(contenido.getText());
                res = 1 / op1;
                contenido.setText(Double.toString(res));
            }
        } catch (NumberFormatException ev) {
            JOptionPane.showMessageDialog(this, "Revisa, seguramente es un punto :V");
        }
        contenido.requestFocus();
    }

    private void formWindowActivated(WindowEvent evt) {
        this.requestFocus();
    }

    @Override
    public void keyTyped(KeyEvent e) {
        setFocusable(true);
        System.out.println(e.getKeyChar());
        char teclapresionada = e.getKeyChar();
        switch (e.getKeyChar()) {
            case '1':
                b1.doClick();
                
                break;
            case '2':
                b2.doClick();
                break;
            case '3':
                b3.doClick();
                break;
            case '4':
                b4.doClick();
                break;
            case '5':
                b5.doClick();
                break;
            case '6':
                b6.doClick();
                break;
            case '7':
                b7.doClick();
                break;
            case '8':
                b8.doClick();
                break;
            case '9':
                b9.doClick();
                break;
            case '0':
                b0.doClick();
                break;
            case '-':
                resta.doClick();
                contenido.setText("-");
                sob=true;
                break;
            case '+':
                
                suma.doClick();
                contenido.setText("+");
                sob=true;
                break;
            case '/':
                div.doClick();
                contenido.setText("/");
                sob=true;
                break;
            case '*':
                mult.doClick();
                contenido.setText("*");
                sob=true;
                break;
            case '%':
                bporcentaje.doClick();
                break;
            case '√':
                braiz.doClick();
                break;
            case '±':
                bsigno.doClick();
                break;
            case '.':
                punto.doClick();
               
                
                break;
            
                
               
                

        }
        if(teclapresionada==KeyEvent.VK_ENTER){// =
                igual.doClick();     
                }
        if(teclapresionada==KeyEvent.VK_BACK_SPACE){ // <-
                bretroceder.doClick();     
                }
        if(teclapresionada==KeyEvent.VK_DELETE){ // CE
                bCE.doClick();     
                }
        if(teclapresionada==KeyEvent.VK_DELETE){ // C
                bC.doClick();     
                }
        if (!(e.getKeyChar() >= '0' && e.getKeyChar() <= '9') && e.getExtendedKeyCode() != KeyEvent.VK_BACK_SPACE  && e.getKeyChar() != '-' && e.getKeyChar() != '+') {
            e.consume();
        }
        //punto pendiente
        
      /*  if(contenido.getText().contains(".")){
            e.consume();
        }
       */ 

    }

    @Override
    public void keyPressed(KeyEvent e) {
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }

}
