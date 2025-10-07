
import java.io.Serializable;
import java.util.Calendar;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


@Entity
@Table(name="Tarefa")
public class Tarefa implements Serializable
{
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String descricao;
    @Temporal(TemporalType.DATE)
    private Calendar dataPrazo;
    @Enumerated(EnumType.ORDINAL)
    private EPrioridade prioridade;
    @Enumerated(EnumType.ORDINAL)
    private EStatus status;
    
    public Calendar getDataPrazo() {
        return dataPrazo;
    }

    public void setDataPrazo(Calendar dataPrazo) {
        this.dataPrazo = dataPrazo;
    }

    public EStatus getStatus() {
        return status;
    }

    public void setStatus(EStatus status) {
        this.status = status;
    }

    public EPrioridade getPrioridade() {
        return prioridade;
    }

    public void setPrioridade(EPrioridade prioridade) {
        this.prioridade = prioridade;
    }
    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public int getId()
    {
        return id;
    }
    public Tarefa(){}
    public Tarefa(String descricao, Calendar dataPrazo, EPrioridade prioridade, EStatus status) {
        this.descricao = descricao;
        this.dataPrazo = dataPrazo;
        this.prioridade = prioridade;
        this.status = status;
    }
}
