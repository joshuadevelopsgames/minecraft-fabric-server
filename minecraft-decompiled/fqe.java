import com.google.gson.annotations.SerializedName;
import javax.annotation.Nullable;

public class fqe extends fqq implements fqg {
   @SerializedName("pvp")
   public boolean a = true;
   @SerializedName("spawnMonsters")
   public boolean b = true;
   @SerializedName("spawnProtection")
   public int c = 0;
   @SerializedName("commandBlocks")
   public boolean d = false;
   @SerializedName("forceGameMode")
   public boolean e = false;
   @SerializedName("difficulty")
   public int f = 2;
   @SerializedName("gameMode")
   public int g = 0;
   @SerializedName("slotName")
   private String m = "";
   @SerializedName("version")
   public String h = "";
   @SerializedName("compatibility")
   public fpx.a i = fpx.a.a;
   @SerializedName("worldTemplateId")
   public long j = -1L;
   @Nullable
   @SerializedName("worldTemplateImage")
   public String k = null;
   public boolean l;

   private fqe() {
   }

   public fqe(boolean $$0, boolean $$1, int $$2, boolean $$3, int $$4, int $$5, boolean $$6, String $$7, String $$8, fpx.a $$9) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
      this.f = $$4;
      this.g = $$5;
      this.e = $$6;
      this.m = $$7;
      this.h = $$8;
      this.i = $$9;
   }

   public static fqe a() {
      return new fqe();
   }

   public static fqe a(dmr $$0, boolean $$1, bxg $$2, boolean $$3, String $$4, String $$5) {
      fqe $$6 = a();
      $$6.d = $$1;
      $$6.f = $$2.a();
      $$6.g = $$0.a();
      $$6.m = $$5;
      $$6.h = $$4;
      return $$6;
   }

   public static fqe a(dmy $$0, boolean $$1, String $$2) {
      return a($$0.b(), $$1, $$0.d(), $$0.c(), $$2, $$0.a());
   }

   public static fqe b() {
      fqe $$0 = a();
      $$0.a(true);
      return $$0;
   }

   public void a(boolean $$0) {
      this.l = $$0;
   }

   public static fqe a(fpk $$0, String $$1) {
      fqe $$2 = $$0.a($$1, fqe.class);
      if ($$2 == null) {
         return a();
      } else {
         a($$2);
         return $$2;
      }
   }

   private static void a(fqe $$0) {
      if ($$0.m == null) {
         $$0.m = "";
      }

      if ($$0.h == null) {
         $$0.h = "";
      }

      if ($$0.i == null) {
         $$0.i = fpx.a.a;
      }
   }

   public String a(int $$0) {
      if (bdb.h(this.m)) {
         return this.l ? htb.a("mco.configure.world.slot.empty") : this.b($$0);
      } else {
         return this.m;
      }
   }

   public String b(int $$0) {
      return htb.a("mco.configure.world.slot", $$0);
   }

   public fqe c() {
      return new fqe(this.a, this.b, this.c, this.d, this.f, this.g, this.e, this.m, this.h, this.i);
   }
}
