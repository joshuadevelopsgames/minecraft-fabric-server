import com.google.common.collect.ImmutableList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public record fwj(List<efe.a<?>> b) {
   public static final fwj a = new fwj(List.of());
   private static final Comparator<efe.a<?>> c = Comparator.comparing($$0 -> $$0.a().f());

   public fwj a(efe.a<?> $$0) {
      return new fwj(ag.a(this.b, $$0));
   }

   public fwj a(fwj $$0) {
      return new fwj(ImmutableList.builder().addAll(this.b).addAll($$0.b).build());
   }

   public static fwj a(efe.a<?>... $$0) {
      return new fwj(List.of($$0));
   }

   public String a() {
      return this.b.stream().sorted(c).map(efe.a::toString).collect(Collectors.joining(","));
   }

   @Override
   public String toString() {
      return this.a();
   }
}
