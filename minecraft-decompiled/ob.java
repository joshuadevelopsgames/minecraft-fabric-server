import java.util.function.BiConsumer;

public record ob(jn.a a) implements nr {
   @Override
   public void generate(BiConsumer<amd<fdo>, fdo.a> $$0) {
      jn.b<dnx> $$1 = this.a.e(mn.aK);
      $$0.accept(
         fdf.am,
         fdo.b()
            .a(
               fdn.a()
                  .a(fhl.a(1.0F))
                  .a(fec.a(fdf.an).a(10).b(-2))
                  .a(fec.a(fdf.ao).a(5).b(2).a(fgv.a(fdj.b.a, bz.a.a().a(cf.a(true)))))
                  .a(fec.a(fdf.ap).a(85).b(-1))
            )
      );
      $$0.accept(fdf.ap, a());
      $$0.accept(
         fdf.an,
         fdo.b()
            .a(
               fdn.a()
                  .a(fdw.a(dqb.fF).a(17))
                  .a(fdw.a(dcz.qG).a(10).a(ffp.a(fhs.a(0.0F, 0.9F))))
                  .a(fdw.a(dcz.rK).a(10))
                  .a(fdw.a(dcz.sY).a(10))
                  .a(fdw.a(dcz.tK).a(10).a(ffu.a(des.a)))
                  .a(fdw.a(dcz.qx).a(5))
                  .a(fdw.a(dcz.su).a(2).a(ffp.a(fhs.a(0.0F, 0.9F))))
                  .a(fdw.a(dcz.py).a(10))
                  .a(fdw.a(dcz.qv).a(5))
                  .a(fdw.a(dcz.sE).a(1).a(ffo.a(fhl.a(10.0F))))
                  .a(fdw.a(dqb.gg).a(10))
                  .a(fdw.a(dcz.tD).a(10))
                  .a(fdw.a(dqb.nG).a(fgq.a(cv.a.a().a(jp.a($$1.b(doe.y), $$1.b(doe.z), $$1.b(doe.A))))).a(10))
            )
      );
      $$0.accept(
         fdf.ao,
         fdo.b()
            .a(
               fdn.a()
                  .a(fdw.a(dcz.wo))
                  .a(fdw.a(dcz.ov))
                  .a(fdw.a(dcz.pA).a(ffp.a(fhs.a(0.0F, 0.25F))).a(fen.a(this.a, fhl.a(30.0F))))
                  .a(fdw.a(dcz.su).a(ffp.a(fhs.a(0.0F, 0.25F))).a(fen.a(this.a, fhl.a(30.0F))))
                  .a(fdw.a(dcz.rW).a(fen.a(this.a, fhl.a(30.0F))))
                  .a(fdw.a(dcz.xy))
            )
      );
   }

   public static fdo.a a() {
      return fdo.b().a(fdn.a().a(fdw.a(dcz.sy).a(60)).a(fdw.a(dcz.sz).a(25)).a(fdw.a(dcz.sA).a(2)).a(fdw.a(dcz.sB).a(13)));
   }

   public jn.a b() {
      return this.a;
   }
}
