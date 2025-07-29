import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import org.slf4j.Logger;

public class axl implements axo, AutoCloseable {
   private static final Logger a = LogUtils.getLogger();
   private axe c;
   private final List<axi> d = Lists.newArrayList();
   private final awd e;

   public axl(awd $$0) {
      this.e = $$0;
      this.c = new axh($$0, List.of());
   }

   @Override
   public void close() {
      this.c.close();
   }

   public void a(axi $$0) {
      this.d.add($$0);
   }

   public axk a(Executor $$0, Executor $$1, CompletableFuture<bdk> $$2, List<awb> $$3) {
      a.info("Reloading ResourceManager: {}", LogUtils.defer(() -> $$3.stream().map(awb::b).collect(Collectors.joining(", "))));
      this.c.close();
      this.c = new axh(this.e, $$3);
      return axu.a(this.c, this.d, $$0, $$1, $$2, a.isDebugEnabled());
   }

   @Override
   public Optional<axm> getResource(ame $$0) {
      return this.c.getResource($$0);
   }

   @Override
   public Set<String> a() {
      return this.c.a();
   }

   @Override
   public List<axm> a(ame $$0) {
      return this.c.a($$0);
   }

   @Override
   public Map<ame, axm> b(String $$0, Predicate<ame> $$1) {
      return this.c.b($$0, $$1);
   }

   @Override
   public Map<ame, List<axm>> c(String $$0, Predicate<ame> $$1) {
      return this.c.c($$0, $$1);
   }

   @Override
   public Stream<awb> b() {
      return this.c.b();
   }
}
