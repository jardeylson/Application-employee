package aplication;

import javax.swing.*; //para utilizar classes e interfaces para componentes GUI.

public class main {
    public static void main(String[] args) {

        //caixa de dialogo, entrada de dados.
        String name = JOptionPane.showInputDialog("Insert the employee's name:");
        //converte a string obtida em int.
        int number = Integer.parseInt(JOptionPane.showInputDialog("insert the employee number:"));
        String cpf = JOptionPane.showInputDialog("insert the employee number:");

        //Cria um objeto Funcionario e atribui o seguinte parametro, depois insere na lista.
        Funcionario func = new Funcionario(name, number, cpf);

        JOptionPane.showMessageDialog(null,func); //exibe um dialogo com a nossa classe, saída de dados.
    }
}
