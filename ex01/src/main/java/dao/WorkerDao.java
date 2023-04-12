package dao;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import pojo.Worker;

public interface WorkerDao {
    @Select("select * from tb_worker where id=#{id}")
    Worker selectWorker(int id);

    @Select("select * from tb_worker where id=#{id} and name=#{name}")
    Worker selectWorkerByIdAndName(@Param("id") int id, @Param("name") String name);
}
