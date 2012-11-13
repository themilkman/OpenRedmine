

package jp.redmine.redmineclient.entity;

import java.util.Date;
import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

@DatabaseTable
public class RedmineFilter {
	public final static String ID = "id";
	public final static String CONNECTION = "connection_id";
	public final static String PROJECT = "project_id";
	public final static String TRACKER = "tracker_id";
	public final static String AUTHOR = "author_id";
	public final static String ASSIGNED = "assigned_id";
	public final static String STATUS = "status_id";
	public final static String PRIORITY = "priority_id";
	public final static String CATEGORY = "category_id";
	public final static String VERSION = "version_id";
	public final static String CURRENT = "is_current";

    @DatabaseField(generatedId = true)
    private Integer id;
    @DatabaseField
    private Integer connection_id;
    @DatabaseField
    private boolean is_current;
    @DatabaseField
    private boolean is_default;
    @DatabaseField
    private boolean is_completed;
    @DatabaseField(foreign = true,foreignColumnName="id", columnName= "project_id", foreignAutoRefresh = true)
    private RedmineProject project;
    @DatabaseField(foreign = true,foreignColumnName="id", columnName= "tracker_id", foreignAutoRefresh = true)
    private RedmineTracker tracker;
    @DatabaseField(foreign = true,foreignColumnName="id", columnName= "status_id", foreignAutoRefresh = true)
    private RedmineStatus status;
    @DatabaseField(foreign = true,foreignColumnName="id", columnName= "priority_id", foreignAutoRefresh = true)
    private RedminePriority priority;
    @DatabaseField(foreign = true,foreignColumnName="id", columnName= "author_id", foreignAutoRefresh = true)
    private RedmineUser author;
    @DatabaseField(foreign = true,foreignColumnName="id", columnName= "assign_id", foreignAutoRefresh = true)
    private RedmineUser assigned;
    @DatabaseField(foreign = true,foreignColumnName="id", columnName= "category_id", foreignAutoRefresh = true)
    private RedmineProjectCategory category;
    @DatabaseField(foreign = true,foreignColumnName="id", columnName= "version_id", foreignAutoRefresh = true)
    private RedmineProjectVersion version;
    @DatabaseField
    private long fetched;
    @DatabaseField
    private String name;
    @DatabaseField
    private String sort;

    @DatabaseField
    private Date created_from;
    @DatabaseField
    private Date created_to;
    @DatabaseField
    private Date modified_from;
    @DatabaseField
    private Date modified_to;
    @DatabaseField
    private Date first;
    @DatabaseField
    private Date last;

	/**
	 * @param id セットする id
	 */
	public void setId(Integer id) {
		this.id = id;
	}
	/**
	 * @return id
	 */
	public Integer getId() {
		return id;
	}
	////////////////////////////////////////////////////////
	/**
	 * @param connection セットする connection
	 */
	public void RedmineConnection(RedmineConnection connection) {
		this.connection_id = connection.getId();
	}
	/**
	 * @return name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name セットする name
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @param created セットする created
	 */
	public void setCreatedFrom(Date created) {
		this.created_from = created;
	}
	/**
	 * @return created
	 */
	public Date getCreatedFrom() {
		return created_from;
	}
	/**
	 * @param created セットする created
	 */
	public void setCreatedTo(Date created) {
		this.created_to = created;
	}
	/**
	 * @return created
	 */
	public Date getCreateTo() {
		return created_to;
	}
	/**
	 * @param modified セットする modified
	 */
	public void setModifiedFrom(Date modified) {
		this.modified_from = modified;
	}
	/**
	 * @return modified
	 */
	public Date getModifiedFrom() {
		return modified_from;
	}
	/**
	 * @param modified セットする modified
	 */
	public void setModifiedTo(Date modified) {
		this.modified_to = modified;
	}
	/**
	 * @return modified
	 */
	public Date getModifiedTo() {
		return modified_to;
	}


	/**
	 * @param project セットする project
	 */
	public void setProject(RedmineProject project) {
		this.project = project;
	}


	/**
	 * @return project
	 */
	public RedmineProject getProject() {
		return project;
	}


	/**
	 * @param connection_id セットする connection_id
	 */
	public void setConnectionId(Integer connection_id) {
		this.connection_id = connection_id;
	}


	/**
	 * @return connection_id
	 */
	public Integer getConnectionId() {
		return connection_id;
	}


	/**
	 * @param tracker セットする tracker
	 */
	public void setTracker(RedmineTracker tracker) {
		this.tracker = tracker;
	}


	/**
	 * @return tracker
	 */
	public RedmineTracker getTracker() {
		return tracker;
	}


	/**
	 * @param status セットする status
	 */
	public void setStatus(RedmineStatus status) {
		this.status = status;
	}


	/**
	 * @return status
	 */
	public RedmineStatus getStatus() {
		return status;
	}


	/**
	 * @param priority セットする priority
	 */
	public void setPriority(RedminePriority priority) {
		this.priority = priority;
	}


	/**
	 * @return priority
	 */
	public RedminePriority getPriority() {
		return priority;
	}


	/**
	 * @param author セットする author
	 */
	public void setAuthor(RedmineUser author) {
		this.author = author;
	}


	/**
	 * @return author
	 */
	public RedmineUser getAuthor() {
		return author;
	}


	/**
	 * @param assigned セットする assigned
	 */
	public void setAssigned(RedmineUser assigned) {
		this.assigned = assigned;
	}


	/**
	 * @return assigned
	 */
	public RedmineUser getAssigned() {
		return assigned;
	}


	/**
	 * @param category セットする category
	 */
	public void setCategory(RedmineProjectCategory category) {
		this.category = category;
	}


	/**
	 * @return category
	 */
	public RedmineProjectCategory getCategory() {
		return category;
	}



	public void setRedmineConnection(RedmineConnection info) {
		setConnectionId(info.getId());
	}


	/**
	 * @param version セットする version
	 */
	public void setVersion(RedmineProjectVersion version) {
		this.version = version;
	}


	/**
	 * @return version
	 */
	public RedmineProjectVersion getVersion() {
		return version;
	}
	/**
	 * @return first
	 */
	public Date getFirst() {
		return first;
	}
	/**
	 * @param first セットする first
	 */
	public void setFirst(Date first) {
		this.first = first;
	}
	/**
	 * @return last
	 */
	public Date getLast() {
		return last;
	}
	/**
	 * @param last セットする last
	 */
	public void setLast(Date last) {
		this.last = last;
	}
	/**
	 * @return current
	 */
	public boolean isCurrent() {
		return is_current;
	}
	/**
	 * @param current セットする current
	 */
	public void setCurrent(boolean current) {
		this.is_current = current;
	}
	/**
	 * @return sort
	 */
	public String getSort() {
		return sort;
	}
	/**
	 * @param sort セットする sort
	 */
	public void setSort(String sort) {
		this.sort = sort;
	}
	/**
	 * @return fetched
	 */
	public long getFetched() {
		return fetched;
	}
	/**
	 * @param fetched セットする fetched
	 */
	public void setFetched(long fetched) {
		this.fetched = fetched;
	}
	/**
	 * @return is_default
	 */
	public boolean isDefault() {
		return is_default;
	}
	/**
	 * @param is_default セットする is_default
	 */
	public void setDefault(boolean is_default) {
		this.is_default = is_default;
	}
	/**
	 * @return is_completed
	 */
	public boolean isCompleted() {
		return is_completed;
	}
	/**
	 * @param is_completed セットする is_completed
	 */
	public void setCompleted(boolean is_completed) {
		this.is_completed = is_completed;
	}




}