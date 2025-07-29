import java.util.concurrent.Executor;
import javax.annotation.Nullable;

public class auo implements aul {
   private final aul a;
   private final bvy b;
   private boolean c;

   private auo(aul $$0, Executor $$1) {
      this.a = $$0;
      this.b = new bvy($$1, "progressListener");
   }

   public static auo a(aul $$0, Executor $$1) {
      auo $$2 = new auo($$0, $$1);
      $$2.a();
      return $$2;
   }

   @Override
   public void a(dlz $$0) {
      this.b.a_(() -> this.a.a($$0));
   }

   @Override
   public void a(dlz $$0, @Nullable egz $$1) {
      if (this.c) {
         this.b.a_(() -> this.a.a($$0, $$1));
      }
   }

   @Override
   public void a() {
      this.c = true;
      this.b.a_(this.a::a);
   }

   @Override
   public void b() {
      this.c = false;
      this.b.a_(this.a::b);
   }
}
