@Service
public class WishlistService {

    @Autowired
    private WishlistRepository wishlistRepository;

    public List<Wishlist> getUserWishlist(Long userId) {
        return wishlistRepository.findByUserId(userId);
    }

    public Wishlist addWishlistItem(Long userId, String itemName) {
        Wishlist wishlist = new Wishlist();
        wishlist.setUserId(userId);
        wishlist.setItemName(itemName);
        return wishlistRepository.save(wishlist);
    }

    public void deleteWishlistItem(Long id) {
        wishlistRepository.deleteById(id);
    }
}

