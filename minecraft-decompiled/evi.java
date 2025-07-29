import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.logging.LogUtils;
import java.util.function.Function;
import org.slf4j.Logger;

public abstract class evi extends evc {
   private static final Logger h = LogUtils.getLogger();
   protected final String a;
   protected eza b;
   protected eyw c;
   protected jb d;

   public evi(evp $$0, int $$1, ezb $$2, ame $$3, String $$4, eyw $$5, jb $$6) {
      super($$0, $$1, $$2.a($$3).b($$5, $$6));
      this.a(jh.c);
      this.a = $$4;
      this.d = $$6;
      this.b = $$2.a($$3);
      this.c = $$5;
   }

   public evi(evp $$0, ui $$1, ezb $$2, Function<ame, eyw> $$3) {
      super($$0, $$1);
      this.a(jh.c);
      this.a = $$1.b("Template", "");
      this.d = new jb($$1.b("TPX", 0), $$1.b("TPY", 0), $$1.b("TPZ", 0));
      ame $$4 = this.b();
      this.b = $$2.a($$4);
      this.c = $$3.apply($$4);
      this.f = this.b.b(this.c, this.d);
   }

   protected ame b() {
      return ame.a(this.a);
   }

   @Override
   protected void a(evo $$0, ui $$1) {
      $$1.a("TPX", this.d.u());
      $$1.a("TPY", this.d.v());
      $$1.a("TPZ", this.d.w());
      $$1.a("Template", this.a);
   }

   @Override
   public void a(dnt $$0, dnq $$1, efz $$2, bck $$3, euq $$4, dlz $$5, jb $$6) {
      this.c.a($$4);
      this.f = this.b.b(this.c, this.d);
      if (this.b.a($$0, this.d, $$6, this.c, $$3, 2)) {
         for (eza.d $$8 : this.b.a(this.d, this.c, dqb.pH)) {
            if ($$8.c() != null) {
               efl $$9 = $$8.c().<efl>a("mode", efl.e).orElseThrow();
               if ($$9 == efl.d) {
                  this.a($$8.c().b("metadata", ""), $$8.a(), $$0, $$3, $$4);
               }
            }
         }

         for (eza.d $$11 : this.b.a(this.d, this.c, dqb.pI)) {
            if ($$11.c() != null) {
               String $$12 = $$11.c().b("final_state", "minecraft:air");
               eeb $$13 = dqb.a.m();

               try {
                  $$13 = gi.a($$0.a(mn.i), $$12, true).a();
               } catch (CommandSyntaxException var15) {
                  h.error("Error while parsing blockstate {} in jigsaw block @ {}", $$12, $$11.a());
               }

               $$0.a($$11.a(), $$13, 3);
            }
         }
      }
   }

   protected abstract void a(String var1, jb var2, dnl var3, bck var4, euq var5);

   @Deprecated
   @Override
   public void a(int $$0, int $$1, int $$2) {
      super.a($$0, $$1, $$2);
      this.d = this.d.b($$0, $$1, $$2);
   }

   @Override
   public dwu a() {
      return this.c.d();
   }

   public eza c() {
      return this.b;
   }

   public jb d() {
      return this.d;
   }

   public eyw e() {
      return this.c;
   }
}
