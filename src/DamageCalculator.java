@FunctionalInterface
public interface DamageCalculator {

    int calculate(
            int baseDamage,
            int armor,
            double critMultiplier);

}
