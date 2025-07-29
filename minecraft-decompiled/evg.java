import com.mojang.logging.LogUtils;
import java.util.List;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public final class evg {
   public static final String a = "INVALID";
   public static final evg b = new evg(null, new dlz(0, 0), 0, new evn(List.of()));
   private static final Logger c = LogUtils.getLogger();
   private final euy d;
   private final evn e;
   private final dlz f;
   private int g;
   @Nullable
   private volatile euq h;

   public evg(euy $$0, dlz $$1, int $$2, evn $$3) {
      this.d = $$0;
      this.f = $$1;
      this.g = $$2;
      this.e = $$3;
   }

   @Nullable
   public static evg a(evo $$0, ui $$1, long $$2) {
      String $$3 = $$1.b("id", "");
      if ("INVALID".equals($$3)) {
         return b;
      } else {
         jy<euy> $$4 = $$0.b().f(mn.bj);
         euy $$5 = $$4.a(ame.a($$3));
         if ($$5 == null) {
            c.error("Unknown stucture id: {}", $$3);
            return null;
         } else {
            dlz $$6 = new dlz($$1.b("ChunkX", 0), $$1.b("ChunkZ", 0));
            int $$7 = $$1.b("references", 0);
            uo $$8 = $$1.p("Children");

            try {
               evn $$9 = evn.a($$8, $$0);
               if ($$5 instanceof exj) {
                  $$9 = exj.a($$6, $$2, $$9);
               }

               return new evg($$5, $$6, $$7, $$9);
            } catch (Exception var11) {
               c.error("Failed Start with id {}", $$3, var11);
               return null;
            }
         }
      }
   }

   public euq a() {
      euq $$0 = this.h;
      if ($$0 == null) {
         $$0 = this.d.a(this.e.b());
         this.h = $$0;
      }

      return $$0;
   }

   public void a(dnt $$0, dnq $$1, efz $$2, bck $$3, euq $$4, dlz $$5) {
      List<evc> $$6 = this.e.c();
      if (!$$6.isEmpty()) {
         euq $$7 = $$6.get(0).f;
         jb $$8 = $$7.g();
         jb $$9 = new jb($$8.u(), $$7.i(), $$8.w());

         for (evc $$10 : $$6) {
            if ($$10.f().a($$4)) {
               $$10.a($$0, $$1, $$2, $$3, $$4, $$5, $$9);
            }
         }

         this.d.a($$0, $$1, $$2, $$3, $$4, $$5, this.e);
      }
   }

   public ui a(evo $$0, dlz $$1) {
      ui $$2 = new ui();
      if (this.b()) {
         $$2.a("id", $$0.b().f(mn.bj).b(this.d).toString());
         $$2.a("ChunkX", $$1.h);
         $$2.a("ChunkZ", $$1.i);
         $$2.a("references", this.g);
         $$2.a("Children", this.e.a($$0));
         return $$2;
      } else {
         $$2.a("id", "INVALID");
         return $$2;
      }
   }

   public boolean b() {
      return !this.e.a();
   }

   public dlz c() {
      return this.f;
   }

   public boolean d() {
      return this.g < this.g();
   }

   public void e() {
      this.g++;
   }

   public int f() {
      return this.g;
   }

   protected int g() {
      return 1;
   }

   public euy h() {
      return this.d;
   }

   public List<evc> i() {
      return this.e.c();
   }
}
