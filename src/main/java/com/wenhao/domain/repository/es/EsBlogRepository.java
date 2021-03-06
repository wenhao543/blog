/**
 * 
 */
package com.wenhao.domain.repository.es;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

import com.wenhao.domain.es.EsBlog;

/**
 * @author wenhao
 *
 */
public interface EsBlogRepository extends ElasticsearchRepository<EsBlog, String>{

	/**
	 * 分页查询博客（去重）
	 * @param title
	 * @param summary
	 * @param content
	 * @param pageable
	 * @return
	 */
	Page<EsBlog> findDistinctEsBlogByTitleContainingOrSummaryContainingOrContentContaining(String title, String summary, String content, Pageable pageable);
}
