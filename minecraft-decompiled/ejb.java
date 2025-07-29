import com.mojang.serialization.Codec;
import javax.annotation.Nullable;

public record ejb(int ak) {
   public static final jl.c<ejb> a = a("block_activate");
   public static final jl.c<ejb> b = a("block_attach");
   public static final jl.c<ejb> c = a("block_change");
   public static final jl.c<ejb> d = a("block_close");
   public static final jl.c<ejb> e = a("block_deactivate");
   public static final jl.c<ejb> f = a("block_destroy");
   public static final jl.c<ejb> g = a("block_detach");
   public static final jl.c<ejb> h = a("block_open");
   public static final jl.c<ejb> i = a("block_place");
   public static final jl.c<ejb> j = a("container_close");
   public static final jl.c<ejb> k = a("container_open");
   public static final jl.c<ejb> l = a("drink");
   public static final jl.c<ejb> m = a("eat");
   public static final jl.c<ejb> n = a("elytra_glide");
   public static final jl.c<ejb> o = a("entity_damage");
   public static final jl.c<ejb> p = a("entity_die");
   public static final jl.c<ejb> q = a("entity_dismount");
   public static final jl.c<ejb> r = a("entity_interact");
   public static final jl.c<ejb> s = a("entity_mount");
   public static final jl.c<ejb> t = a("entity_place");
   public static final jl.c<ejb> u = a("entity_action");
   public static final jl.c<ejb> v = a("equip");
   public static final jl.c<ejb> w = a("explode");
   public static final jl.c<ejb> x = a("flap");
   public static final jl.c<ejb> y = a("fluid_pickup");
   public static final jl.c<ejb> z = a("fluid_place");
   public static final jl.c<ejb> A = a("hit_ground");
   public static final jl.c<ejb> B = a("instrument_play");
   public static final jl.c<ejb> C = a("item_interact_finish");
   public static final jl.c<ejb> D = a("item_interact_start");
   public static final jl.c<ejb> E = a("jukebox_play", 10);
   public static final jl.c<ejb> F = a("jukebox_stop_play", 10);
   public static final jl.c<ejb> G = a("lightning_strike");
   public static final jl.c<ejb> H = a("note_block_play");
   public static final jl.c<ejb> I = a("prime_fuse");
   public static final jl.c<ejb> J = a("projectile_land");
   public static final jl.c<ejb> K = a("projectile_shoot");
   public static final jl.c<ejb> L = a("sculk_sensor_tendrils_clicking");
   public static final jl.c<ejb> M = a("shear");
   public static final jl.c<ejb> N = a("shriek", 32);
   public static final jl.c<ejb> O = a("splash");
   public static final jl.c<ejb> P = a("step");
   public static final jl.c<ejb> Q = a("swim");
   public static final jl.c<ejb> R = a("teleport");
   public static final jl.c<ejb> S = a("unequip");
   public static final jl.c<ejb> T = a("resonate_1");
   public static final jl.c<ejb> U = a("resonate_2");
   public static final jl.c<ejb> V = a("resonate_3");
   public static final jl.c<ejb> W = a("resonate_4");
   public static final jl.c<ejb> X = a("resonate_5");
   public static final jl.c<ejb> Y = a("resonate_6");
   public static final jl.c<ejb> Z = a("resonate_7");
   public static final jl.c<ejb> aa = a("resonate_8");
   public static final jl.c<ejb> ab = a("resonate_9");
   public static final jl.c<ejb> ac = a("resonate_10");
   public static final jl.c<ejb> ad = a("resonate_11");
   public static final jl.c<ejb> ae = a("resonate_12");
   public static final jl.c<ejb> af = a("resonate_13");
   public static final jl.c<ejb> ag = a("resonate_14");
   public static final jl.c<ejb> ah = a("resonate_15");
   public static final int ai = 16;
   public static final Codec<jl<ejb>> aj = amb.a(mn.J);

   public static jl<ejb> a(jy<ejb> $$0) {
      return a;
   }

   public int a() {
      return this.ak;
   }

   private static jl.c<ejb> a(String $$0) {
      return a($$0, 16);
   }

   private static jl.c<ejb> a(String $$0, int $$1) {
      return jy.b(mm.a, ame.b($$0), new ejb($$1));
   }

   public record a(@Nullable bzm a, @Nullable eeb b) {
      public static ejb.a a(@Nullable bzm $$0) {
         return new ejb.a($$0, null);
      }

      public static ejb.a a(@Nullable eeb $$0) {
         return new ejb.a(null, $$0);
      }

      public static ejb.a a(@Nullable bzm $$0, @Nullable eeb $$1) {
         return new ejb.a($$0, $$1);
      }
   }

   public static final class b implements Comparable<ejb.b> {
      private final jl<ejb> a;
      private final fis b;
      private final ejb.a c;
      private final ejd d;
      private final double e;

      public b(jl<ejb> $$0, fis $$1, ejb.a $$2, ejd $$3, fis $$4) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.d = $$3;
         this.e = $$1.g($$4);
      }

      public int a(ejb.b $$0) {
         return Double.compare(this.e, $$0.e);
      }

      public jl<ejb> a() {
         return this.a;
      }

      public fis b() {
         return this.b;
      }

      public ejb.a c() {
         return this.c;
      }

      public ejd d() {
         return this.d;
      }
   }
}
