import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.function.Function;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class aww {
   private static final Logger a = LogUtils.getLogger();
   private final awa b;
   private final aww.c c;
   private final aww.a d;
   private final awc e;

   @Nullable
   public static aww a(awa $$0, aww.c $$1, awd $$2, awc $$3) {
      int $$4 = ac.b().a($$2);
      aww.a $$5 = a($$0, $$1, $$4);
      return $$5 != null ? new aww($$0, $$1, $$5, $$3) : null;
   }

   public aww(awa $$0, aww.c $$1, aww.a $$2, awc $$3) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
      this.e = $$3;
   }

   @Nullable
   public static aww.a a(awa $$0, aww.c $$1, int $$2) {
      try {
         aww.a var11;
         try (awb $$3 = $$1.a($$0)) {
            awp $$4 = $$3.a(awp.b);
            if ($$4 == null) {
               a.warn("Missing metadata in pack {}", $$0.a());
               return null;
            }

            avx $$5 = $$3.a(avx.a);
            cyd $$6 = $$5 != null ? $$5.a() : cyd.a();
            bbt<Integer> $$7 = a($$0.a(), $$4);
            awx $$8 = awx.a($$7, $$2);
            avz $$9 = $$3.a(avz.a);
            List<String> $$10 = $$9 != null ? $$9.a($$2) : List.of();
            var11 = new aww.a($$4.a(), $$8, $$6, $$10);
         }

         return var11;
      } catch (Exception var14) {
         a.warn("Failed to read pack {} metadata", $$0.a(), var14);
         return null;
      }
   }

   private static bbt<Integer> a(String $$0, awp $$1) {
      int $$2 = $$1.b();
      if ($$1.c().isEmpty()) {
         return new bbt<>($$2);
      } else {
         bbt<Integer> $$3 = $$1.c().get();
         if (!$$3.a($$2)) {
            a.warn("Pack {} declared support for versions {} but declared main format is {}, defaulting to {}", new Object[]{$$0, $$3, $$2, $$2});
            return new bbt<>($$2);
         } else {
            return $$3;
         }
      }
   }

   public awa a() {
      return this.b;
   }

   public xo b() {
      return this.b.b();
   }

   public xo c() {
      return this.d.a();
   }

   public xo a(boolean $$0) {
      return this.b.a($$0, this.d.a);
   }

   public awx d() {
      return this.d.b();
   }

   public cyd e() {
      return this.d.c();
   }

   public awb f() {
      return this.c.a(this.b, this.d);
   }

   public String g() {
      return this.b.a();
   }

   public awc h() {
      return this.e;
   }

   public boolean i() {
      return this.e.a();
   }

   public boolean j() {
      return this.e.c();
   }

   public aww.b k() {
      return this.e.b();
   }

   public axa l() {
      return this.b.c();
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else {
         return !($$0 instanceof aww $$1) ? false : this.b.equals($$1.b);
      }
   }

   @Override
   public int hashCode() {
      return this.b.hashCode();
   }

   public record a(xo a, awx b, cyd c, List<String> d) {
   }

   public static enum b {
      a,
      b;

      public <T> int a(List<T> $$0, T $$1, Function<T, awc> $$2, boolean $$3) {
         aww.b $$4 = $$3 ? this.a() : this;
         if ($$4 == b) {
            int $$5;
            for ($$5 = 0; $$5 < $$0.size(); $$5++) {
               awc $$6 = $$2.apply($$0.get($$5));
               if (!$$6.c() || $$6.b() != this) {
                  break;
               }
            }

            $$0.add($$5, $$1);
            return $$5;
         } else {
            int $$7;
            for ($$7 = $$0.size() - 1; $$7 >= 0; $$7--) {
               awc $$8 = $$2.apply($$0.get($$7));
               if (!$$8.c() || $$8.b() != this) {
                  break;
               }
            }

            $$0.add($$7 + 1, $$1);
            return $$7 + 1;
         }
      }

      public aww.b a() {
         return this == a ? b : a;
      }
   }

   public interface c {
      awb a(awa var1);

      awb a(awa var1, aww.a var2);
   }
}
