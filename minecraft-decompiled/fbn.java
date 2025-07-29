import com.mojang.logging.LogUtils;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fbn implements fbs {
   private static final Logger b = LogUtils.getLogger();
   private final dmu c;
   private final int d;
   private final ArrayDeque<fbn.c> e = new ArrayDeque<>();
   private final List<fbn.c> f = new ArrayList<>();
   private int g = 0;

   public fbn(dmu $$0, int $$1) {
      this.c = $$0;
      this.d = $$1;
   }

   @Override
   public void a(jh $$0, eeb $$1, jb $$2, jb $$3, int $$4, int $$5) {
      this.a($$2, new fbn.d($$0, $$1, $$2.j(), $$3.j(), $$4, $$5));
   }

   @Override
   public void a(jb $$0, dpz $$1, @Nullable fbt $$2) {
      this.a($$0, new fbn.e($$0, $$1, $$2));
   }

   @Override
   public void a(eeb $$0, jb $$1, dpz $$2, @Nullable fbt $$3, boolean $$4) {
      this.a($$1, new fbn.a($$0, $$1.j(), $$2, $$3, $$4));
   }

   @Override
   public void a(jb $$0, dpz $$1, @Nullable jh $$2, @Nullable fbt $$3) {
      this.a($$0, new fbn.b($$0.j(), $$1, $$3, $$2));
   }

   private void a(jb $$0, fbn.c $$1) {
      boolean $$2 = this.g > 0;
      boolean $$3 = this.d >= 0 && this.g >= this.d;
      this.g++;
      if (!$$3) {
         if ($$2) {
            this.f.add($$1);
         } else {
            this.e.push($$1);
         }
      } else if (this.g - 1 == this.d) {
         b.error("Too many chained neighbor updates. Skipping the rest. First skipped position: " + $$0.x());
      }

      if (!$$2) {
         this.a();
      }
   }

   private void a() {
      try {
         while (!this.e.isEmpty() || !this.f.isEmpty()) {
            for (int $$0 = this.f.size() - 1; $$0 >= 0; $$0--) {
               this.e.push(this.f.get($$0));
            }

            this.f.clear();
            fbn.c $$1 = this.e.peek();

            while (this.f.isEmpty()) {
               if (!$$1.a(this.c)) {
                  this.e.pop();
                  break;
               }
            }
         }
      } finally {
         this.e.clear();
         this.f.clear();
         this.g = 0;
      }
   }

   record a(eeb a, jb b, dpz c, @Nullable fbt d, boolean e) implements fbn.c {
      @Override
      public boolean a(dmu $$0) {
         fbs.a($$0, this.a, this.b, this.c, this.d, this.e);
         return false;
      }
   }

   static final class b implements fbn.c {
      private final jb a;
      private final dpz b;
      @Nullable
      private fbt c;
      @Nullable
      private final jh d;
      private int e = 0;

      b(jb $$0, dpz $$1, @Nullable fbt $$2, @Nullable jh $$3) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.d = $$3;
         if (fbs.a[this.e] == $$3) {
            this.e++;
         }
      }

      @Override
      public boolean a(dmu $$0) {
         jh $$1 = fbs.a[this.e++];
         jb $$2 = this.a.a($$1);
         eeb $$3 = $$0.a_($$2);
         fbt $$4 = null;
         if ($$0.L().b(cyf.c)) {
            if (this.c == null) {
               this.c = fbp.a($$0, this.d == null ? null : this.d.g(), null);
            }

            $$4 = this.c.b($$1);
         }

         fbs.a($$0, $$3, $$2, this.b, $$4, false);
         if (this.e < fbs.a.length && fbs.a[this.e] == this.d) {
            this.e++;
         }

         return this.e < fbs.a.length;
      }
   }

   interface c {
      boolean a(dmu var1);
   }

   record d(jh a, eeb b, jb c, jb d, int e, int f) implements fbn.c {
      @Override
      public boolean a(dmu $$0) {
         fbs.a($$0, this.a, this.c, this.d, this.b, this.e, this.f);
         return false;
      }
   }

   record e(jb a, dpz b, @Nullable fbt c) implements fbn.c {
      @Override
      public boolean a(dmu $$0) {
         eeb $$1 = $$0.a_(this.a);
         fbs.a($$0, $$1, this.a, this.b, this.c, false);
         return false;
      }
   }
}
