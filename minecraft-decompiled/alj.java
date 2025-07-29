import io.netty.buffer.ByteBuf;
import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;
import javax.annotation.Nullable;
import org.joml.Quaternionf;
import org.joml.Vector3f;

public class alj {
   private static final baw<ali<?>> J = baw.c(16);
   public static final ali<Byte> a = ali.a(zk.c);
   public static final ali<Integer> b = ali.a(zk.h);
   public static final ali<Long> c = ali.a(zk.k);
   public static final ali<Float> d = ali.a(zk.l);
   public static final ali<String> e = ali.a(zk.p);
   public static final ali<xo> f = ali.a(xq.d);
   public static final ali<Optional<xo>> g = ali.a(xq.e);
   public static final ali<dcv> h = new ali<dcv>() {
      @Override
      public zm<? super wx, dcv> codec() {
         return dcv.h;
      }

      public dcv a(dcv $$0) {
         return $$0.v();
      }
   };
   public static final ali<eeb> i = ali.a(zk.a(dpz.k));
   private static final zm<ByteBuf, Optional<eeb>> K = new zm<ByteBuf, Optional<eeb>>() {
      public void a(ByteBuf $$0, Optional<eeb> $$1) {
         if ($$1.isPresent()) {
            xf.a($$0, dpz.j($$1.get()));
         } else {
            xf.a($$0, 0);
         }
      }

      public Optional<eeb> a(ByteBuf $$0) {
         int $$1 = xf.a($$0);
         return $$1 == 0 ? Optional.empty() : Optional.of(dpz.a($$1));
      }
   };
   public static final ali<Optional<eeb>> j = ali.a(K);
   public static final ali<Boolean> k = ali.a(zk.b);
   public static final ali<mc> l = ali.a(me.bl);
   public static final ali<List<mc>> m = ali.a(me.bl.a(zk.a()));
   public static final ali<kd> n = ali.a(kd.b);
   public static final ali<jb> o = ali.a(jb.b);
   public static final ali<Optional<jb>> p = ali.a(jb.b.a(zk::a));
   public static final ali<jh> q = ali.a(jh.j);
   public static final ali<Optional<bzs<cam>>> r = ali.a(bzs.b().a(zk::a));
   public static final ali<Optional<jk>> s = ali.a(jk.c.a(zk::a));
   public static final ali<ui> t = new ali<ui>() {
      @Override
      public zm<? super wx, ui> codec() {
         return zk.t;
      }

      public ui a(ui $$0) {
         return $$0.l();
      }
   };
   public static final ali<cug> u = ali.a(cug.d);
   private static final zm<ByteBuf, OptionalInt> L = new zm<ByteBuf, OptionalInt>() {
      public OptionalInt a(ByteBuf $$0) {
         int $$1 = xf.a($$0);
         return $$1 == 0 ? OptionalInt.empty() : OptionalInt.of($$1 - 1);
      }

      public void a(ByteBuf $$0, OptionalInt $$1) {
         xf.a($$0, $$1.orElse(-1) + 1);
      }
   };
   public static final ali<OptionalInt> v = ali.a(L);
   public static final ali<cay> w = ali.a(cay.t);
   public static final ali<jl<cmh>> x = ali.a(cmh.d);
   public static final ali<jl<cmk>> y = ali.a(cmk.d);
   public static final ali<jl<cmo>> z = ali.a(cmo.d);
   public static final ali<jl<cpm>> A = ali.a(cpm.d);
   public static final ali<jl<cpk>> B = ali.a(cpk.d);
   public static final ali<jl<coe>> C = ali.a(coe.d);
   public static final ali<jl<cnb>> D = ali.a(cnb.d);
   public static final ali<jl<cqv>> E = ali.a(cqv.d);
   public static final ali<cnr.a> F = ali.a(cnr.a.e);
   public static final ali<cpg.a> G = ali.a(cpg.a.i);
   public static final ali<Vector3f> H = ali.a(zk.v);
   public static final ali<Quaternionf> I = ali.a(zk.w);

   public static void a(ali<?> $$0) {
      J.d($$0);
   }

   @Nullable
   public static ali<?> a(int $$0) {
      return J.a($$0);
   }

   public static int b(ali<?> $$0) {
      return J.a($$0);
   }

   private alj() {
   }

   static {
      a(a);
      a(b);
      a(c);
      a(d);
      a(e);
      a(f);
      a(g);
      a(h);
      a(k);
      a(n);
      a(o);
      a(p);
      a(q);
      a(r);
      a(i);
      a(j);
      a(t);
      a(l);
      a(m);
      a(u);
      a(v);
      a(w);
      a(x);
      a(z);
      a(A);
      a(B);
      a(C);
      a(D);
      a(y);
      a(s);
      a(E);
      a(G);
      a(F);
      a(H);
      a(I);
   }
}
