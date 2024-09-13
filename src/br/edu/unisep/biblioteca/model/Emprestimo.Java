package br.edu.unisep.biblioteca.model;



import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Emprestimo {
    private Calendar data;
     private Calendar devolucao;

    public Emprestimo() {
    }

 public Emprestimo(Calendar data, Calendar devolucao) {
    this.data = data;
    this.devolucao = devolucao;
    }

    public Calendar getData() {
    return data;
    }

    public Calendar getDevolucao() {
    return devolucao;
    }

    public void setData(Calendar data) {
     this.data = data;
    }
        public void setDevolucao(Calendar devolucao) {
            this.devolucao = devolucao;
 }

 @Override
    public String toString() {
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss dd/MM/yyyy");
             return "Emprestimo\n" +
             "Data de emprestio: " + sdf.format(this.data.getTime()) + "\n" +
                "Data de devolucao: " + sdf.format(this.devolucao.getTime());
     }
}
