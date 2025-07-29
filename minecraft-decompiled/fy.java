import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import com.mojang.serialization.DynamicOps;
import java.util.Collection;
import java.util.List;

public class fy extends btb<yl> {
   private static final Collection<String> b = List.of("{bold: true}", "{color: 'red'}", "{}");
   public static final DynamicCommandExceptionType a = new DynamicCommandExceptionType($$0 -> xo.b("argument.style.invalid", $$0));
   private static final DynamicOps<vi> c = uw.a;
   private static final bsw<vi> d = vc.a(c);

   private fy(jn.a $$0) {
      super(d.a($$0.a(c), d, yl.b.b, a));
   }

   public static yl a(CommandContext<ek> $$0, String $$1) {
      return (yl)$$0.getArgument($$1, yl.class);
   }

   public static fy a(eg $$0) {
      return new fy($$0);
   }

   public Collection<String> getExamples() {
      return b;
   }
}
