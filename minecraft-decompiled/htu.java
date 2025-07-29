import java.util.EnumMap;
import java.util.Map;
import org.joml.Matrix4f;
import org.joml.Matrix4fc;

public enum htu implements hui {
   a(i.a, i.a),
   b(i.a, i.b),
   c(i.a, i.c),
   d(i.a, i.d),
   e(i.b, i.a),
   f(i.b, i.b),
   g(i.b, i.c),
   h(i.b, i.d),
   i(i.c, i.a),
   j(i.c, i.b),
   k(i.c, i.c),
   l(i.c, i.d),
   m(i.d, i.a),
   n(i.d, i.b),
   o(i.d, i.c),
   p(i.d, i.d);

   private static final htu[][] r = ag.a(new htu[i.values().length][i.values().length], $$0 -> {
      for (htu $$1 : values()) {
         $$0[$$1.s.ordinal()][$$1.t.ordinal()] = $$1;
      }
   });
   private final i s;
   private final i t;
   final k u;
   private final h v;
   final Map<jh, Matrix4fc> w = new EnumMap<>(jh.class);
   final Map<jh, Matrix4fc> x = new EnumMap<>(jh.class);
   private final htu.a y = new htu.a(this);

   private htu(final i $$0, final i $$1) {
      this.s = $$0;
      this.t = $$1;
      this.v = h.a($$0, $$1);
      if (this.v != h.a) {
         this.u = new k(new Matrix4f(this.v.b()));
      } else {
         this.u = k.a();
      }

      for (jh $$2 : jh.values()) {
         Matrix4fc $$3 = ja.a(this.u, $$2).c();
         this.w.put($$2, $$3);
         this.x.put($$2, $$3.invertAffine(new Matrix4f()));
      }
   }

   @Override
   public k a() {
      return this.u;
   }

   public static htu a(i $$0, i $$1) {
      return r[$$0.ordinal()][$$1.ordinal()];
   }

   public h b() {
      return this.v;
   }

   public hui c() {
      return this.y;
   }

   record a(htu a) implements hui {
      @Override
      public k a() {
         return this.a.u;
      }

      @Override
      public Matrix4fc a(jh $$0) {
         return this.a.w.getOrDefault($$0, q);
      }

      @Override
      public Matrix4fc b(jh $$0) {
         return this.a.x.getOrDefault($$0, q);
      }

      public htu b() {
         return this.a;
      }
   }
}
