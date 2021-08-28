package br.com.agenda;

import android.app.Application;

import br.com.agenda.dao.AlunoDAO;
import br.com.agenda.model.Aluno;

public class AgendaApplication extends Application {

    @Override
    public void onCreate() {
        criaAlunosDeTeste();
        super.onCreate();
    }

    private void criaAlunosDeTeste() {
        AlunoDAO dao = new AlunoDAO();
        dao.salva(new Aluno("Eduardo", "1234567890", "eduardo@gmail.com"));
        dao.salva(new Aluno("Renaria", "1234567890", "renaria@gmail.com"));
        dao.salva(new Aluno("Gilberto", "1234567890", "gilberto@gmail.com"));
    }
}
