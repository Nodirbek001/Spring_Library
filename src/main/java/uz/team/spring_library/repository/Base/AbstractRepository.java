package uz.team.spring_library.repository.Base;

import org.springframework.data.jpa.repository.JpaRepository;
import uz.team.spring_library.entity.BaseGenericEntity;

import java.io.Serializable;

public interface AbstractRepository<
        E extends BaseGenericEntity,
        K extends Serializable>
        extends JpaRepository<E, K>, BaseRepository {

}
