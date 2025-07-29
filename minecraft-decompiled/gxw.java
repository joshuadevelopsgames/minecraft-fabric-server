import it.unimi.dsi.fastutil.objects.Object2ObjectLinkedOpenHashMap;
import java.util.SequencedMap;

public class gxw {
   private final gyc a = new gyc();
   private final gyd b;
   private final gxn.a c;
   private final gxn.a d;
   private final gxp e;

   public gxw(int $$0) {
      this.b = gyd.a($$0);
      SequencedMap<gxz, foa> $$1 = ag.a(new Object2ObjectLinkedOpenHashMap(), $$0x -> {
         $$0x.put(gyi.h(), this.a.a(hba.a));
         $$0x.put(gyi.i(), this.a.a(hba.c));
         $$0x.put(gyi.a(), this.a.a(hba.b));
         $$0x.put(gyi.j(), this.a.a(hba.d));
         a($$0x, gyi.b());
         a($$0x, gyi.c());
         a($$0x, gyi.d());
         a($$0x, gyi.e());
         a($$0x, gyi.f());
         $$0x.put(gyi.g(), new foa(786432));
         a($$0x, gxz.j());
         a($$0x, gxz.l());
         a($$0x, gxz.k());
         a($$0x, gxz.m());
         a($$0x, gxz.i());
      });
      this.c = gxn.a($$1, new foa(786432));
      this.e = new gxp(this.c);
      SequencedMap<gxz, foa> $$2 = ag.a(new Object2ObjectLinkedOpenHashMap(), $$0x -> hud.l.forEach($$1x -> a($$0x, $$1x)));
      this.d = gxn.a($$2, new foa(0));
   }

   private static void a(Object2ObjectLinkedOpenHashMap<gxz, foa> $$0, gxz $$1) {
      $$0.put($$1, new foa($$1.E()));
   }

   public gyc a() {
      return this.a;
   }

   public gyd b() {
      return this.b;
   }

   public gxn.a c() {
      return this.c;
   }

   public gxn.a d() {
      return this.d;
   }

   public gxp e() {
      return this.e;
   }
}
