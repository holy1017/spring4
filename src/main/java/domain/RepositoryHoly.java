public interpace RepositoryHoly extend JpaRepository<EntityHoly,Long> {
List<EntityHoly> findByName(String name);
}
