import com.mojang.blaze3d.pipeline.RenderPipeline;

public record gaq(gxz a, gxz b, gxz c, RenderPipeline d) {
   public static gaq a(ame $$0) {
      return new gaq(gxz.v($$0), gxz.z($$0), gxz.x($$0), gxx.J);
   }

   public static gaq b(ame $$0) {
      return new gaq(gxz.u($$0), gxz.y($$0), gxz.w($$0), gxx.H);
   }

   public gxz a(fwz.a $$0) {
      return switch ($$0) {
         case a -> this.a;
         case b -> this.b;
         case c -> this.c;
      };
   }
}
