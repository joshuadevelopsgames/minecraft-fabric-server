import com.google.common.collect.Lists;
import com.mojang.serialization.Dynamic;
import com.mojang.serialization.DynamicOps;
import java.util.List;
import java.util.Locale;

public class euu extends evc {
   protected final ewg a;
   protected jb b;
   private final int d;
   protected final dwu c;
   private final List<ewb> h = Lists.newArrayList();
   private final ezb i;
   private final eyk j;

   public euu(ezb $$0, ewg $$1, jb $$2, int $$3, dwu $$4, euq $$5, eyk $$6) {
      super(evp.ad, 0, $$5);
      this.i = $$0;
      this.a = $$1;
      this.b = $$2;
      this.d = $$3;
      this.c = $$4;
      this.j = $$6;
   }

   public euu(evo $$0, ui $$1) {
      super(evp.ad, $$1);
      this.i = $$0.c();
      this.b = new jb($$1.b("PosX", 0), $$1.b("PosY", 0), $$1.b("PosZ", 0));
      this.d = $$1.b("ground_level_delta", 0);
      DynamicOps<vi> $$2 = $$0.b().a(uw.a);
      this.a = $$1.<ewg>a("pool_element", ewg.f, $$2).orElseThrow(() -> new IllegalStateException("Invalid pool element found"));
      this.c = $$1.<dwu>a("rotation", dwu.h).orElseThrow();
      this.f = this.a.a(this.i, this.b, this.c);
      uo $$3 = $$1.p("junctions");
      this.h.clear();
      $$3.forEach($$1x -> this.h.add(ewb.a(new Dynamic($$2, $$1x))));
      this.j = $$1.<eyk>a("liquid_settings", eyk.c).orElse(ewz.e);
   }

   @Override
   protected void a(evo $$0, ui $$1) {
      $$1.a("PosX", this.b.u());
      $$1.a("PosY", this.b.v());
      $$1.a("PosZ", this.b.w());
      $$1.a("ground_level_delta", this.d);
      DynamicOps<vi> $$2 = $$0.b().a(uw.a);
      $$1.a("pool_element", ewg.f, $$2, this.a);
      $$1.a("rotation", dwu.h, this.c);
      uo $$3 = new uo();

      for (ewb $$4 : this.h) {
         $$3.add((vi)$$4.a($$2).getValue());
      }

      $$1.a("junctions", $$3);
      if (this.j != ewz.e) {
         $$1.a("liquid_settings", eyk.c, $$2, this.j);
      }
   }

   @Override
   public void a(dnt $$0, dnq $$1, efz $$2, bck $$3, euq $$4, dlz $$5, jb $$6) {
      this.a($$0, $$1, $$2, $$3, $$4, $$6, false);
   }

   public void a(dnt $$0, dnq $$1, efz $$2, bck $$3, euq $$4, jb $$5, boolean $$6) {
      this.a.a(this.i, $$0, $$1, $$2, this.b, $$5, this.c, $$4, $$3, this.j, $$6);
   }

   @Override
   public void a(int $$0, int $$1, int $$2) {
      super.a($$0, $$1, $$2);
      this.b = this.b.b($$0, $$1, $$2);
   }

   @Override
   public dwu a() {
      return this.c;
   }

   @Override
   public String toString() {
      return String.format(Locale.ROOT, "<%s | %s | %s | %s>", this.getClass().getSimpleName(), this.b, this.c, this.a);
   }

   public ewg b() {
      return this.a;
   }

   public jb c() {
      return this.b;
   }

   public int d() {
      return this.d;
   }

   public void a(ewb $$0) {
      this.h.add($$0);
   }

   public List<ewb> e() {
      return this.h;
   }
}
