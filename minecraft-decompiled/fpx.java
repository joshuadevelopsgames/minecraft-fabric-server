import com.google.common.collect.ComparisonChain;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.mojang.logging.LogUtils;
import com.mojang.util.UUIDTypeAdapter;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;
import java.util.Map.Entry;
import javax.annotation.Nullable;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.slf4j.Logger;

public class fpx extends fqq implements fqg {
   private static final Logger z = LogUtils.getLogger();
   private static final int A = -1;
   public static final xo a = xo.c("mco.play.button.realm.closed");
   @SerializedName("id")
   public long b = -1L;
   @Nullable
   @SerializedName("remoteSubscriptionId")
   public String c;
   @Nullable
   @SerializedName("name")
   public String d;
   @SerializedName("motd")
   public String e = "";
   @SerializedName("state")
   public fpx.c f = fpx.c.a;
   @Nullable
   @SerializedName("owner")
   public String g;
   @SerializedName("ownerUUID")
   @JsonAdapter(UUIDTypeAdapter.class)
   public UUID h = ag.e;
   @SerializedName("players")
   public List<fpp> i = Lists.newArrayList();
   @SerializedName("slots")
   private List<fqb> B = k();
   @fpj
   public Map<Integer, fqb> j = new HashMap<>();
   @SerializedName("expired")
   public boolean k;
   @SerializedName("expiredTrial")
   public boolean l = false;
   @SerializedName("daysLeft")
   public int m;
   @SerializedName("worldType")
   public fpx.d n = fpx.d.a;
   @SerializedName("isHardcore")
   public boolean o = false;
   @SerializedName("gameMode")
   public int p = -1;
   @SerializedName("activeSlot")
   public int q = -1;
   @Nullable
   @SerializedName("minigameName")
   public String r;
   @SerializedName("minigameId")
   public int s = -1;
   @Nullable
   @SerializedName("minigameImage")
   public String t;
   @SerializedName("parentWorldId")
   public long u = -1L;
   @Nullable
   @SerializedName("parentWorldName")
   public String v;
   @SerializedName("activeVersion")
   public String w = "";
   @SerializedName("compatibility")
   public fpx.a x = fpx.a.a;
   @Nullable
   @SerializedName("regionSelectionPreference")
   public fqk y;

   public String a() {
      return this.e;
   }

   @Nullable
   public String b() {
      return this.d;
   }

   @Nullable
   public String c() {
      return this.r;
   }

   public void a(String $$0) {
      this.d = $$0;
   }

   public void b(String $$0) {
      this.e = $$0;
   }

   public static fpx a(fpk $$0, String $$1) {
      try {
         fpx $$2 = $$0.a($$1, fpx.class);
         if ($$2 == null) {
            z.error("Could not parse McoServer: {}", $$1);
            return new fpx();
         } else {
            a($$2);
            return $$2;
         }
      } catch (Exception var3) {
         z.error("Could not parse McoServer: {}", var3.getMessage());
         return new fpx();
      }
   }

   public static void a(fpx $$0) {
      if ($$0.i == null) {
         $$0.i = Lists.newArrayList();
      }

      if ($$0.B == null) {
         $$0.B = k();
      }

      if ($$0.j == null) {
         $$0.j = new HashMap<>();
      }

      if ($$0.n == null) {
         $$0.n = fpx.d.a;
      }

      if ($$0.w == null) {
         $$0.w = "";
      }

      if ($$0.x == null) {
         $$0.x = fpx.a.a;
      }

      if ($$0.y == null) {
         $$0.y = fqk.a;
      }

      b($$0);
      c($$0);
   }

   private static void b(fpx $$0) {
      $$0.i
         .sort(
            ($$0x, $$1) -> ComparisonChain.start()
               .compareFalseFirst($$1.d(), $$0x.d())
               .compare($$0x.a().toLowerCase(Locale.ROOT), $$1.a().toLowerCase(Locale.ROOT))
               .result()
         );
   }

   private static void c(fpx $$0) {
      $$0.B.forEach($$1x -> $$0.j.put($$1x.a, $$1x));

      for (int $$1 = 1; $$1 <= 3; $$1++) {
         if (!$$0.j.containsKey($$1)) {
            $$0.j.put($$1, fqb.a($$1));
         }
      }
   }

   private static List<fqb> k() {
      List<fqb> $$0 = new ArrayList<>();
      $$0.add(fqb.a(1));
      $$0.add(fqb.a(2));
      $$0.add(fqb.a(3));
      return $$0;
   }

   public boolean d() {
      return this.x.a();
   }

   public boolean e() {
      return this.x.b();
   }

   public boolean f() {
      return this.x.c();
   }

   public boolean g() {
      boolean $$0 = !this.k && this.f == fpx.c.b;
      return $$0 && (this.d() || this.e() || this.l());
   }

   private boolean l() {
      return fue.R().b(this.h);
   }

   @Override
   public int hashCode() {
      return Objects.hash(this.b, this.d, this.e, this.f, this.g, this.k);
   }

   @Override
   public boolean equals(Object $$0) {
      if ($$0 == null) {
         return false;
      } else if ($$0 == this) {
         return true;
      } else if ($$0.getClass() != this.getClass()) {
         return false;
      } else {
         fpx $$1 = (fpx)$$0;
         return new EqualsBuilder()
            .append(this.b, $$1.b)
            .append(this.d, $$1.d)
            .append(this.e, $$1.e)
            .append(this.f, $$1.f)
            .append(this.g, $$1.g)
            .append(this.k, $$1.k)
            .append(this.n, this.n)
            .isEquals();
      }
   }

   public fpx h() {
      fpx $$0 = new fpx();
      $$0.b = this.b;
      $$0.c = this.c;
      $$0.d = this.d;
      $$0.e = this.e;
      $$0.f = this.f;
      $$0.g = this.g;
      $$0.i = this.i;
      $$0.B = this.B.stream().map(fqb::a).toList();
      $$0.j = this.a(this.j);
      $$0.k = this.k;
      $$0.l = this.l;
      $$0.m = this.m;
      $$0.n = this.n;
      $$0.o = this.o;
      $$0.p = this.p;
      $$0.h = this.h;
      $$0.r = this.r;
      $$0.q = this.q;
      $$0.s = this.s;
      $$0.t = this.t;
      $$0.v = this.v;
      $$0.u = this.u;
      $$0.w = this.w;
      $$0.x = this.x;
      $$0.y = this.y != null ? this.y.a() : null;
      return $$0;
   }

   public Map<Integer, fqb> a(Map<Integer, fqb> $$0) {
      Map<Integer, fqb> $$1 = Maps.newHashMap();

      for (Entry<Integer, fqb> $$2 : $$0.entrySet()) {
         $$1.put($$2.getKey(), new fqb($$2.getKey(), $$2.getValue().b.c(), $$2.getValue().c));
      }

      return $$1;
   }

   public boolean i() {
      return this.u != -1L;
   }

   public boolean j() {
      return this.n == fpx.d.b;
   }

   public String a(int $$0) {
      return this.d == null ? this.j.get($$0).b.a($$0) : this.d + " (" + this.j.get($$0).b.a($$0) + ")";
   }

   public grz c(String $$0) {
      return new grz(Objects.requireNonNullElse(this.d, "unknown server"), $$0, grz.c.b);
   }

   public static enum a {
      a,
      b,
      c,
      d,
      e,
      f;

      public boolean a() {
         return this == f;
      }

      public boolean b() {
         return this == e;
      }

      public boolean c() {
         return this == d;
      }
   }

   public static class b implements Comparator<fpx> {
      private final String a;

      public b(String $$0) {
         this.a = $$0;
      }

      public int a(fpx $$0, fpx $$1) {
         return ComparisonChain.start()
            .compareTrueFirst($$0.i(), $$1.i())
            .compareTrueFirst($$0.f == fpx.c.c, $$1.f == fpx.c.c)
            .compareTrueFirst($$0.l, $$1.l)
            .compareTrueFirst(Objects.equals($$0.g, this.a), Objects.equals($$1.g, this.a))
            .compareFalseFirst($$0.k, $$1.k)
            .compareTrueFirst($$0.f == fpx.c.b, $$1.f == fpx.c.b)
            .compare($$0.b, $$1.b)
            .result();
      }
   }

   public static enum c {
      a,
      b,
      c;
   }

   public static enum d {
      a,
      b,
      c,
      d,
      e;
   }
}
