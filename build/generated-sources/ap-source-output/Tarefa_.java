import java.util.Calendar;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Tarefa.class)
public abstract class Tarefa_ {

	public static volatile SingularAttribute<Tarefa, EPrioridade> prioridade;
	public static volatile SingularAttribute<Tarefa, Calendar> dataPrazo;
	public static volatile SingularAttribute<Tarefa, Integer> id;
	public static volatile SingularAttribute<Tarefa, String> descricao;
	public static volatile SingularAttribute<Tarefa, EStatus> status;

	public static final String PRIORIDADE = "prioridade";
	public static final String DATA_PRAZO = "dataPrazo";
	public static final String ID = "id";
	public static final String DESCRICAO = "descricao";
	public static final String STATUS = "status";

}

