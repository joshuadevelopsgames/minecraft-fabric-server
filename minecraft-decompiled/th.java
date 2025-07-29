import com.google.common.collect.Lists;
import java.util.Collection;
import javax.annotation.Nullable;

public class th {
   public static final th a = new th();
   private final Collection<sz> b = Lists.newCopyOnWriteArrayList();
   @Nullable
   private te c;
   private th.a d = th.a.a;
   private volatile boolean e = false;

   private th() {
   }

   public void a(sz $$0) {
      this.b.add($$0);
   }

   public void a() {
      if (this.d != th.a.a) {
         this.d = th.a.c;
      } else {
         this.b.clear();
         if (this.c != null) {
            this.c.c();
            this.c = null;
         }
      }
   }

   public void a(te $$0) {
      if (this.c != null) {
         ag.b("The runner was already set in GameTestTicker");
      }

      this.c = $$0;
   }

   public void b() {
      this.e = true;
   }

   public void c() {
      if (this.c != null && this.e) {
         this.d = th.a.b;
         this.b.forEach($$0x -> $$0x.a(this.c));
         this.b.removeIf(sz::k);
         th.a $$0 = this.d;
         this.d = th.a.a;
         if ($$0 == th.a.c) {
            this.a();
         }
      }
   }

   static enum a {
      a,
      b,
      c;
   }
}
