import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Curso curso= new Curso();
        curso.setTitulo("curso java");
        curso.setDescricao("orientaçao a objetos com java");
        curso.setCargaHoraria(2);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria java");
        mentoria.setDescricao("mentoria para o curso java");
        mentoria.setCargaHoraria(2);
        mentoria.setData(LocalDate.now());

        System.out.println(curso);
        System.out.println(mentoria);
    }
}