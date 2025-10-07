
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;


public class Main {
 
    public static void main(String[] args) {
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("GestorDeTarefasPU");
        EntityManager em = factory.createEntityManager();
        
        Tarefa obra = new Tarefa("Jantar.", parseData("14/09/2025"), EPrioridade.MEDIA, EStatus.AFAZER);
        
        EntityTransaction tx = em.getTransaction();
        tx.begin();
        em.persist(obra);
        tx.commit();
        em.close();
        factory.close();
    }

    private static Calendar parseData(String data){
        try {
            Date date = new SimpleDateFormat("dd/MM/yyyy").parse(data);
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(date);
            return calendar;
        } catch (ParseException ex) {
            throw new IllegalArgumentException(ex);
        }
    }
}
