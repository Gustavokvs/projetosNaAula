package br.ulbra.GerenciadorDeTarefas;

import java.util.ArrayList;
import java.util.Collections;
import javax.swing.JOptionPane;

public class Organizar {

    private ArrayList tarefas;

    public Organizar() {
        tarefas = new ArrayList();
    }

    public void salvar(String elemento) {
        if (elemento.equalsIgnoreCase("")) {
            JOptionPane.showMessageDialog(null, "Digite alguma coisa.");
        } else {
            tarefas.add(elemento);
            JOptionPane.showMessageDialog(null, "Tarefa Adicionada com Sucesso.");
        }
    }

    public void apagar(int i) {

        if (tarefas.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Não há nenhuma tarefa.");
        } else if (i > tarefas.size()) {
            JOptionPane.showMessageDialog(null, "Não Existe essa tarefa.");

        } else {
            tarefas.remove(i);
            JOptionPane.showMessageDialog(null, "Tarefa Removida com sucesso.");
        }
    }

    public void editar(int i, String novoElemento) {

        if (tarefas.isEmpty()) {
            JOptionPane.showMessageDialog(null, "A lista de tarefas está vazia.");
        } else if (i > tarefas.size() || i > 1) {
            JOptionPane.showMessageDialog(null, "Não existe nenhuma tarefa com esse ID");
        } else {
            tarefas.set(i, novoElemento);
            JOptionPane.showMessageDialog(null, "Tarefa Alterada com Sucesso.");
        }
    }

    public String listar() {
        String elementos = "";

        if (tarefas.isEmpty()) {
            return "Não há nenhuma tarefa.";
        } else {

            for (int i = 0; i < tarefas.size(); i++) {
                elementos += (i + 1) + " . " + tarefas.get(i) + "\n";
            }
            return elementos;
        }
    }

    public boolean verVazio() {
        if (tarefas.isEmpty()) {
            return true;
        }
        return false;
    }

    public void ordenar() {
        Collections.sort(tarefas);
    }

    public void excluirBase() {
        tarefas.clear();

    }

    public String contabilizarTarefas() {

        if (tarefas.isEmpty()) {
            return "Nenhuma Tarefa";
        } else {
            return "" + tarefas.size();
        }

    }

}
