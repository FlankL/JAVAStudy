import java.util.concurrent.ThreadPoolExecutor;

/**
 * @author flank
 * @date 2020/12/4 16:34
 */
public interface Interface2 {
    public interface RejectedExecutionHandler {
        void rejectdExecution(Runnable r, ThreadPoolExecutor executor);
    }

}
