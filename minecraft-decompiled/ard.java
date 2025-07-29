import com.mojang.brigadier.builder.ArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import com.mojang.logging.LogUtils;
import java.util.Locale;
import java.util.UUID;
import java.util.function.Function;
import org.slf4j.Logger;

public class ard implements arb {
   private static final Logger b = LogUtils.getLogger();
   private static final SimpleCommandExceptionType c = new SimpleCommandExceptionType(xo.c("commands.data.entity.invalid"));
   public static final Function<String, arc.c> a = $$0 -> new arc.c() {
      @Override
      public arb a(CommandContext<ek> $$0x) throws CommandSyntaxException {
         return new ard(ey.a($$0, $$0));
      }

      @Override
      public ArgumentBuilder<ek, ?> a(ArgumentBuilder<ek, ?> $$0x, Function<ArgumentBuilder<ek, ?>, ArgumentBuilder<ek, ?>> $$1) {
         return $$0.then(el.b("entity").then($$1.apply(el.a($$0, ey.a()))));
      }
   };
   private final bzm d;

   public ard(bzm $$0) {
      this.d = $$0;
   }

   @Override
   public void a(ui $$0) throws CommandSyntaxException {
      if (this.d instanceof cut) {
         throw c.create();
      } else {
         UUID $$1 = this.d.cK();

         try (bci.j $$2 = new bci.j(this.d.ef(), b)) {
            this.d.e(fcy.a($$2, this.d.eb(), $$0));
            this.d.a_($$1);
         }
      }
   }

   @Override
   public ui a() {
      return da.b(this.d);
   }

   @Override
   public xo b() {
      return xo.a("commands.data.entity.modified", this.d.Q_());
   }

   @Override
   public xo a(vi $$0) {
      return xo.a("commands.data.entity.query", this.d.Q_(), ux.b($$0));
   }

   @Override
   public xo a(fe.g $$0, double $$1, int $$2) {
      return xo.a("commands.data.entity.get", $$0.a(), this.d.Q_(), String.format(Locale.ROOT, "%.2f", $$1), $$2);
   }
}
