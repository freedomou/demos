package ncjt.mapper;

import ncjt.pojo.Worker;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface WorkerMapper {
    /**
     * 根据id查找一条记录，并封装到Worker对象中
     * @param id
     * @return 返回一个Worker对象
     */
    @Select("select * from tb_worker where id=#{id}")
    Worker selectWorkerById(int id);

    @Select("select * from tb_worker")
    List<Worker> selectAllWorker();

    @Insert("insert into tb_worker(name,age,sex,worker_id)values(#{name},#{age},#{sex},#{worker_id})")
    int insertWorker(Worker worker);
}
