@Entity
public class Wishlist {
    public interface WishlistRepository extends JpaRepository<Wishlist, Long> {
        List<Wishlist> findByUserId(Long userId);
    }
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long userId;

    private String itemName;

    // getters and setters
}
