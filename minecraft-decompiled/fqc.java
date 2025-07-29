import com.google.gson.annotations.SerializedName;
import javax.annotation.Nullable;

public final class fqc implements fqg {
   @SerializedName("slotId")
   public final int a;
   @SerializedName("pvp")
   private final boolean b;
   @SerializedName("spawnMonsters")
   private final boolean c;
   @SerializedName("spawnProtection")
   private final int d;
   @SerializedName("commandBlocks")
   private final boolean e;
   @SerializedName("forceGameMode")
   private final boolean f;
   @SerializedName("difficulty")
   private final int g;
   @SerializedName("gameMode")
   private final int h;
   @SerializedName("slotName")
   private final String i;
   @SerializedName("version")
   private final String j;
   @SerializedName("compatibility")
   private final fpx.a k;
   @SerializedName("worldTemplateId")
   private final long l;
   @Nullable
   @SerializedName("worldTemplateImage")
   private final String m;
   @SerializedName("hardcore")
   private final boolean n;

   public fqc(int $$0, fqe $$1, boolean $$2) {
      this.a = $$0;
      this.b = $$1.a;
      this.c = $$1.b;
      this.d = $$1.c;
      this.e = $$1.d;
      this.f = $$1.e;
      this.g = $$1.f;
      this.h = $$1.g;
      this.i = $$1.a($$0);
      this.j = $$1.h;
      this.k = $$1.i;
      this.l = $$1.j;
      this.m = $$1.k;
      this.n = $$2;
   }
}
