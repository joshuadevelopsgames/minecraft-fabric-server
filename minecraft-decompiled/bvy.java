import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;

public class bvy extends bvw<Runnable> {
   public bvy(Executor $$0, String $$1) {
      super(new bwd.b(new ConcurrentLinkedQueue<>()), $$0, $$1);
   }

   @Override
   public Runnable f(Runnable $$0) {
      return $$0;
   }
}
