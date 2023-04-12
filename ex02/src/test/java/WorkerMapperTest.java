import ncjt.mapper.WorkerMapper;
import ncjt.pojo.Worker;
import ncjt.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

public class WorkerMapperTest {
    private SqlSession session;
    private WorkerMapper workerMapper;
    @Before
    public void before(){
        session = MybatisUtils.getSession();
        workerMapper=session.getMapper(WorkerMapper.class);
    }

    @Test
    public void testSelectWorkerById(){
        Worker worker=workerMapper.selectWorkerById(2);
        System.out.println(worker);
    }

    @Test
    public  void testSelectAllWorker(){
        List<Worker> list = workerMapper.selectAllWorker();
        System.out.println(list);
    }

    @Test
    public  void testinsertWorker(){
        Worker w=new Worker();
        w.setName("Jack");
        w.setAge(23);
        w.setWorker_id("1004");
        w.setSex("男");
        workerMapper.insertWorker(w);

    }

    @After
    public void after(){
        session.commit();
        session.close();
    }

}
