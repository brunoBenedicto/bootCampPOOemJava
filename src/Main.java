import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.awt.dnd.DragSourceDragEvent;
import java.time.LocalDate;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Curso curso1= new Curso();
        curso1.setTitulo("curso 1");
        curso1.setDescricao("descriçao do curso 1");
        curso1.setCargaHoraria(2);

        Curso curso2= new Curso();
        curso2.setTitulo("curso 2");
        curso2.setDescricao("descriçao do curso 2");
        curso2.setCargaHoraria(2);

        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("mentoria 1");
        mentoria1.setDescricao("descriçao da mentoria 1");
        mentoria1.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("bootcamp1");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria1);

        Dev dev1 = new Dev();
        dev1.setNome("nomeDev1");
        dev1.inscreverBootcamp(bootcamp);
        System.out.println(dev1.getNome() + " inscrito!");
        System.out.println("conteudos inscritos -");
        System.out.println(dev1.getConteudosInscritos());
        dev1.progredir();
        System.out.println("ainda falta..");
        System.out.println(dev1.getConteudosInscritos());
        System.out.println("concluidos..");
        System.out.println(dev1.getConteudosConcluidos());

    }
}