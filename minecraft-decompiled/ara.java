import com.mojang.brigadier.builder.ArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import com.mojang.logging.LogUtils;
import java.util.Locale;
import java.util.function.Function;
import org.slf4j.Logger;

public class ara implements arb {
   private static final Logger b = LogUtils.getLogger();
   static final SimpleCommandExceptionType c = new SimpleCommandExceptionType(xo.c("commands.data.block.invalid"));
   public static final Function<String, arc.c> a = $$0 -> new arc.c() {
      @Override
      public arb a(CommandContext<ek> $$0x) throws CommandSyntaxException {
         jb $$1 = gk.a($$0, $$0 + "Pos");
         eaz $$2 = ((ek)$$0.getSource()).e().c_($$1);
         if ($$2 == null) {
            throw ara.c.create();
         } else {
            return new ara($$2, $$1);
         }
      }

      @Override
      public ArgumentBuilder<ek, ?> a(ArgumentBuilder<ek, ?> $$0x, Function<ArgumentBuilder<ek, ?>, ArgumentBuilder<ek, ?>> $$1) {
         return $$0.then(el.b("block").then($$1.apply(el.a($$0 + "Pos", gk.a()))));
      }
   };
   private final eaz d;
   private final jb e;

   public ara(eaz $$0, jb $$1) {
      this.d = $$0;
      this.e = $$1;
   }

   @Override
   public void a(ui $$0) {
      eeb $$1 = this.d.i().a_(this.e);

      try (bci.j $$2 = new bci.j(this.d.t(), b)) {
         this.d.b(fcy.a($$2, this.d.i().K_(), $$0));
         this.d.e();
         this.d.i().a(this.e, $$1, $$1, 3);
      }
   }

   @Override
   public ui a() {
      return this.d.b(this.d.i().K_());
   }

   @Override
   public xo b() {
      return xo.a("commands.data.block.modified", this.e.u(), this.e.v(), this.e.w());
   }

   @Override
   public xo a(vi $$0) {
      return xo.a("commands.data.block.query", this.e.u(), this.e.v(), this.e.w(), ux.b($$0));
   }

   @Override
   public xo a(fe.g $$0, double $$1, int $$2) {
      return xo.a("commands.data.block.get", $$0.a(), this.e.u(), this.e.v(), this.e.w(), String.format(Locale.ROOT, "%.2f", $$1), $$2);
   }
}
