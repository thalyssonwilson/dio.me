package collections.map.ordenacao.exercicio1;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;


public class AgendaEventos {
    // atributo
    private Map<LocalDate,Evento> agendaEventos;

    // construtor
    public AgendaEventos() {
        this.agendaEventos = new HashMap<>();
    }

    

    // metodos
    // adiciona um evento à agenda
    public void adicionarEvento(LocalDate data, String nome, List<String> atracao){
        LocalDate dataLocal = LocalDate.now();
        if(data.isAfter(dataLocal)){
            agendaEventos.put(data, new Evento(nome, atracao));
        }
    }


    // exibe a agenda de eventos em ordem crescente de data
    public void exibirAgenda(){
        System.out.println("*  *  *   Agenda de Eventos  Ordenados pela Data *  *  *");
        
        if(!agendaEventos.isEmpty()){
           
            Map<LocalDate, Evento> agendaEventosTreeMap = new TreeMap<>(agendaEventos);
            agendaEventosTreeMap.forEach((LocalDate, Evento) -> {

                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
                String dataFormatada = LocalDate.format(formatter);

                System.out.println("Data: "+dataFormatada+"   \nNome do Evento: "+Evento.getNomeEvento()+"  \nAtração: "+Evento.getNomeAtracao());
                System.out.println();
            });
        }else{
            System.out.println("Nenhum evento foi cadastrado!");
        }
    }

    // retorna o próximo evento que ocorrerá
    public void obterProximoEvento(){
        System.out.println("\n*  *  *   Próximo Evento   *  *  *");
        
        LocalDate dataLocal = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");

        Map<LocalDate, Evento> agendaEventosTreeMap = new TreeMap<>(agendaEventos);
        if (!agendaEventosTreeMap.isEmpty()) {
            for (Map.Entry<LocalDate, Evento> entry : agendaEventosTreeMap.entrySet()) {
                if(entry.getKey().isEqual(dataLocal) || entry.getKey().isAfter(dataLocal)){
                    System.out.println("Data: "+entry.getKey().format(formatter)+"   \nNome do Evento: "+entry.getValue().getNomeEvento()+"  \nAtração: "+entry.getValue().getNomeAtracao());
                    System.out.println();
                    break;
                }
            }
        }else{
            System.out.println("Nenhum evento foi encontrado!");
        }
    }


    public static void main(String[] args) {
        
        AgendaEventos agendaEventosMAP = new AgendaEventos();

        agendaEventosMAP.adicionarEvento(LocalDate.of(2027, 3, 1), "Abelbeetle", Arrays.asList("DJ Nina", "Dj Neno", "Dj Nana")); 
        agendaEventosMAP.adicionarEvento(LocalDate.of(2029, 12, 7), "Natalfest ", Arrays.asList("Maria Carrie", "Nelly Furtado", "Akon"));
        agendaEventosMAP.adicionarEvento(LocalDate.of(2024, 6, 21), "São João", Arrays.asList("João Gomes", "Natanzinho", "Menos é mais"));
        agendaEventosMAP.adicionarEvento(LocalDate.of(2028, 6, 22), "São João", Arrays.asList("Simone Mendes", "Fred Gustavo", "Jorge e Matheus"));
        agendaEventosMAP.adicionarEvento(LocalDate.of(2030, 4, 18), "Eletro Pump", Arrays.asList("Alok", "David Guetta", "PitBull"));
        agendaEventosMAP.exibirAgenda();
        agendaEventosMAP.obterProximoEvento();

    }
}

