package ObjectPool.exercise;

public class BulletPool extends MemoryPool<Bullet> {
    @Override
    protected Bullet allocate() {
        return new Bullet();
    }
}
