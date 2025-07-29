import com.google.common.collect.Lists;
import com.mojang.serialization.Codec;
import java.util.Collections;
import java.util.EnumSet;
import java.util.List;
import javax.annotation.Nullable;
import org.jetbrains.annotations.VisibleForTesting;

public class egz {
   public static final int a = 8;
   private static final EnumSet<eka.a> p = EnumSet.of(eka.a.c, eka.a.a);
   public static final EnumSet<eka.a> b = EnumSet.of(eka.a.d, eka.a.b, eka.a.e, eka.a.f);
   public static final egz c = a("empty", null, p, ehd.a);
   public static final egz d = a("structure_starts", c, p, ehd.a);
   public static final egz e = a("structure_references", d, p, ehd.a);
   public static final egz f = a("biomes", e, p, ehd.a);
   public static final egz g = a("noise", f, p, ehd.a);
   public static final egz h = a("surface", g, p, ehd.a);
   public static final egz i = a("carvers", h, b, ehd.a);
   public static final egz j = a("features", i, b, ehd.a);
   public static final egz k = a("initialize_light", j, b, ehd.a);
   public static final egz l = a("light", k, b, ehd.a);
   public static final egz m = a("spawn", l, b, ehd.a);
   public static final egz n = a("full", m, b, ehd.b);
   public static final Codec<egz> o = mm.l.q();
   private final int q;
   private final egz r;
   private final ehd s;
   private final EnumSet<eka.a> t;

   private static egz a(String $$0, @Nullable egz $$1, EnumSet<eka.a> $$2, ehd $$3) {
      return jy.a(mm.l, $$0, new egz($$1, $$2, $$3));
   }

   public static List<egz> a() {
      List<egz> $$0 = Lists.newArrayList();

      egz $$1;
      for ($$1 = n; $$1.c() != $$1; $$1 = $$1.c()) {
         $$0.add($$1);
      }

      $$0.add($$1);
      Collections.reverse($$0);
      return $$0;
   }

   @VisibleForTesting
   protected egz(@Nullable egz $$0, EnumSet<eka.a> $$1, ehd $$2) {
      this.r = $$0 == null ? this : $$0;
      this.s = $$2;
      this.t = $$1;
      this.q = $$0 == null ? 0 : $$0.b() + 1;
   }

   public int b() {
      return this.q;
   }

   public egz c() {
      return this.r;
   }

   public ehd d() {
      return this.s;
   }

   public static egz a(String $$0) {
      return mm.l.a(ame.c($$0));
   }

   public EnumSet<eka.a> e() {
      return this.t;
   }

   public boolean a(egz $$0) {
      return this.b() >= $$0.b();
   }

   public boolean b(egz $$0) {
      return this.b() > $$0.b();
   }

   public boolean c(egz $$0) {
      return this.b() <= $$0.b();
   }

   public boolean d(egz $$0) {
      return this.b() < $$0.b();
   }

   public static egz a(egz $$0, egz $$1) {
      return $$0.b($$1) ? $$0 : $$1;
   }

   @Override
   public String toString() {
      return this.f();
   }

   public String f() {
      return mm.l.b(this).toString();
   }
}
