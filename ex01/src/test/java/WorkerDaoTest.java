import dao.WorkerDao;
import org.apache.ibatis.session.SqlSession;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import pojo.Worker;
import utils.MybatisUtils;

public class WorkerDaoTest {
    private SqlSession session;
    @Before
    public void before(){
        session= MybatisUtils.getSession();
    }

    @Test
    public void testselectWorker(){
        WorkerDao workerDao=session.getMapper(WorkerDao.class);
        Worker worker = workerDao.selectWorker(2);
        System.out.println(worker);
    }
    @Test
    public void testselectWorkerByIdAndName(){
        WorkerDao workerDao=session.getMapper(WorkerDao.class);
        Worker worker = workerDao.selectWorkerByIdAndName(1,"张三");
        System.out.println(worker);
    }

    @After
    public void after(){
        session.close();
    }
}
